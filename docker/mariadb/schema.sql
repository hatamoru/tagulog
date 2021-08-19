use tagulog;

create table members(
            id int(10) not null auto_increment primary key,
            name varchar(30) not null,
            password varchar(100) not null,
            email varchar (30) unique
);