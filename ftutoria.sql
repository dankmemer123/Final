DROP TABLE IF EXISTS `friends`;
CREATE TABLE  `friends` (
  `Id` int(10) unsigned NOT NULL auto_increment,
  `providerId` int(10) unsigned NOT NULL default '0',
  `requestId` int(10) unsigned NOT NULL default '0',
  `status` binary(1) NOT NULL default '0',
  PRIMARY KEY  (`Id`),
  UNIQUE KEY `Index_3` (`providerId`,`requestId`),
  KEY `Index_2` (`providerId`,`requestId`,`status`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='providerId is the Id of the users who wish to be friend with';



DROP TABLE IF EXISTS `messages`;
CREATE TABLE IF NOT EXISTS `messages` (
	`Id` int(255) unsigned NOT NULL AUTO_INCREMENT,
	`fromuid` int(255) NOT NULL,
	`touid` int(255) NOT NULL,			
	`sentdt` datetime NOT NULL,
	`read` tinyint(1) NOT NULL DEFAULT '0',
	`readdt` datetime DEFAULT NULL,
	`messagetext` longtext CHARACTER SET utf8 NOT NULL,
	PRIMARY KEY (`Id`),
	UNIQUE KEY `Index_1` (`fromuid`, `touid`),
	KEY `Index_3` (`sentdt`)
	
)ENGINE=InnoDB DEFAULT CHARSET=utf8;;


DROP TABLE IF EXISTS `users`;
CREATE TABLE  `users` (
  `Id` int(10) unsigned NOT NULL auto_increment,
  `username` varchar(45) NOT NULL default '',
  `password` varchar(32) NOT NULL default '',
  `email` varchar(45) NOT NULL default '',
  `date` datetime NOT NULL default '0000-00-00 00:00:00',
  `status` tinyint(3) unsigned NOT NULL default '0',
  `authenticationTime` datetime NOT NULL default '0000-00-00 00:00:00',
  `userKey` varchar(32) NOT NULL default '',
  `IP` varchar(45) NOT NULL default '',
  `port` int(10) unsigned NOT NULL default '0',
  PRIMARY KEY  (`Id`),
  UNIQUE KEY `Index_2` (`username`),
  KEY `Index_3` (`authenticationTime`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;












