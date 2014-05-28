#!/bin/bash


PATH=$PATH:/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin

group=`groups $USER | awk -F": " '{print $2}'`
install_directory=`pwd`
ambient=$1
home_directory = ''
install_directory=`pwd`
#Case for determinate ambient
case $ambient in

"desarrollo" )
	home_directory="/dcantv"
	echo "estoy en desarrollo"
;;
"calidad" )
	echo "estoy en calidad"
	home_directory="/tcantv"
;;

"produccion" )
	echo "estoy en producccion"
	home_directory="/pcantv"
;;
esac

sudo /etc/init.d/asterisk stop
sudo /etc/init.d/snmpd stop

sudo cp /etc/asterisk/res_snmp.conf /etc/asterisk/res_snmp.conf.ori
sudo cp /etc/snmp/snmpd.conf /etc/snmp/snmpd.conf.ori

sudo mkdir -p /usr/share/snmp/mibs

cd $home_directory/$USER/$install_directory/src/snmp/

sudo cp digium-mib.txt asterisk-mib.txt /usr/share/snmp/mibs

cd /etc/asterisk/
sudo sed -e 's/;subagent = yes/subagent = yes/' res_snmp.conf.ori > res_snmp.conf
sudo sed -e 's/;enabled = yes/enabled = yes/' res_snmp.conf.ori > res_snmp.conf


cd
sudo echo 'master agentx' >> /etc/snmp/snmpd.conf
sudo echo 'agentXSocket /var/agentx/master' >> /etc/snmp/snmpd.conf
sudo echo 'agentXPerms 0660 0550 nobody $USER' >> /etc/snmp/snmpd.conf
sudo echo 'sysObjectID .1.3.6.1.4.1.22736.1' >> /etc/snmp/snmpd.conf


sudo /etc/init.d/asterisk stop
sudo /etc/init.d/snmpd stop

sleep 10

snmpwalk -v2c 127.0.0.1 -c C0mcantvc0r .1.3.6.1.4.1.22736




