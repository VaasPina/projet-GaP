# installation serveur

sudo apt install -y apache2 apache2-utils

sudo systemctl start apache2

sudo systemctl enable apache2

sudo apt update

sudo apt install -y mariadb-server

sudo apt install php php-cli php-fpm php-json php-common php-mysql php-zip php-gd php-mbstring php-curl php-xml php-pear php-bcmath

sudo apt update

sudo apt install phpmyadmin

sudo mysql -u root

show grants for phpmyadmin@localhost;

exit

sudo apt install mosquitto 

sudo apt-get install libeclipse-jdt-debug-java

