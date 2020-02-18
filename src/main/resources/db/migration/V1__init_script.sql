create database lesson_db;
create user lesson_user with encrypted password 'secret';
grant all privileges on database lesson_db to lesson_user;
ALTER USER lesson_user WITH SUPERUSER;
