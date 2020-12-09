USE `happy_tails_db`;

CREATE TABLE `dogdaycare` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
   `name` varchar(50) NOT NULL,
  `street_number` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  `zipcode` varchar(15) NOT NULL,
  `state` varchar(15) NOT NULL,
  `country` varchar(15) NOT NULL,
  `contact_number` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;