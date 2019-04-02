1. mvn install
2. java -jar demo-0.0.1-SNAPSHOT.jar
3. mysql: root1234
https://jingyan.baidu.com/article/fa4125ac0e3c2928ac709204.html
4. create schema test default character set utf8 collate utf8_general_ci;
create table test.test_table(id int not null, name varchar(20));
insert into test.test_table values(1, 'Ruth');
insert into test.test_table values(2, 'Jason');
insert into test.test_table values(3, 'Sam');
commit;
5. 启动MySql服务：

   sudo /usr/local/mysql/support-files/mysql.server start
   1
   停止MySql服务：

   sudo /usr/local/mysql/support-files/mysql.server stop
   1
   重启MySql服务：

   sudo /usr/local/mysql/support-files/mysql.server restart

6. https://blog.csdn.net/qq_30507287/article/details/80217025
