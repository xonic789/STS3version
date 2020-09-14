CREATE TABLE `emp03` (
	`sabun` INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(10) NOT NULL COLLATE 'utf8_general_ci',
	`nalja` TIMESTAMP NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
	`deptno` INT(11) NOT NULL DEFAULT '0',
	`pay` INT(11) NOT NULL,
	PRIMARY KEY (`sabun`) USING BTREE,
	INDEX `FK__dept03` (`deptno`) USING BTREE,
	CONSTRAINT `FK__dept03` FOREIGN KEY (`deptno`) REFERENCES `xe`.`dept03` (`deptno`) ON UPDATE RESTRICT ON DELETE RESTRICT
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
