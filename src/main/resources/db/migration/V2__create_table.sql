drop table if exists `users`;

CREATE TABLE users (
    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`house_number`    VARCHAR ,
	`street`          VARCHAR ,
	`city`            VARCHAR ,
	`country`         VARCHAR ,
	`state`           VARCHAR ,
	`zip_code`        VARCHAR ,
	`email`           VARCHAR ,
	`first_name`      VARCHAR ,
	`last_name`       VARCHAR ,
	`middle_name`     VARCHAR
);
