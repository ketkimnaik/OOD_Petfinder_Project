USE `happy_tails_db`;

DROP TABLE IF EXISTS `favourites`;
CREATE TABLE `favourites` (
  `user_id` int(11) NOT NULL,
  `dog_id` int(11) NOT NULL,
  
  PRIMARY KEY (`user_id`,`dog_id`),
  
  KEY `FK_DOGDATA_idx` (`dog_id`),
  
  CONSTRAINT `FK_USER_06` FOREIGN KEY (`user_id`) 
  REFERENCES `user` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION,
  
  CONSTRAINT `FK_DOGDATA` FOREIGN KEY (`dog_id`) 
  REFERENCES `dogdata` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `favourites` (user_id,dog_id)
VALUES 
(1, 21290536),
(1, 30526042);
