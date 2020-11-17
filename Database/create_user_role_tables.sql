
USE `happy_tails_db`;

--
-- Table structure for table `user`
--

CREATE TABLE dogdata (
    id INT NOT NULL ,
    org_id VARCHAR(10) NOT NULL,
    pic_new VARCHAR(1000),
    species VARCHAR(255) NOT NULL,
    breed_primary VARCHAR(255),
    breed_secondary VARCHAR(255),
    breed_mixed VARCHAR(255),
    breed_unknown VARCHAR(255),
    color_primary VARCHAR(255),
    age VARCHAR(50),
    sex VARCHAR(50),
    size VARCHAR(50),
    house_trained VARCHAR(255),
    special_needs VARCHAR(100),
    shots_current VARCHAR(100),
    env_children VARCHAR(100),
    env_dogs VARCHAR(255),
    env_cats VARCHAR(255),
    `name` VARCHAR(255),
    tags VARCHAR(255),
    `status` VARCHAR(255),
    posted VARCHAR(255),
    contact_city VARCHAR(50),
    contact_state VARCHAR(50),
    contact_zip INT,
    contact_country VARCHAR(50),
    stateQ VARCHAR(50),
    accessed VARCHAR(50),
    `type` VARCHAR(50),
    `description` VARCHAR(10000),
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
   `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `password` char(80) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--
-- NOTE: The passwords are encrypted using BCrypt
-- Default password is abcd12345

INSERT INTO `user` (first_name,last_name,email,phone, password)
VALUES 
('Ketki','Naik','ketkimnaik@gmail.com','+13159135521', '$2a$10$bHARj0WjI.Y3GKLaDE2vg.iPaloHiztlwMIunrjLQriiJ5ViRgtsu'),
('Subhiksha','Ranganathan','subhi@gmail.com', '+13159135522', '$2a$10$bHARj0WjI.Y3GKLaDE2vg.iPaloHiztlwMIunrjLQriiJ5ViRgtsu' ),
('Mitanshu','Patel','mits@gmail.com', '+13159135523','$2a$10$bHARj0WjI.Y3GKLaDE2vg.iPaloHiztlwMIunrjLQriiJ5ViRgtsu' );


--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `roles`
--

INSERT INTO `role` (name)
VALUES 
('ROLE_USER'), ('ROLE_ADMIN');

--
-- Table structure for table `users_roles`
--

DROP TABLE IF EXISTS `users_roles`;

CREATE TABLE `users_roles` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  
  PRIMARY KEY (`user_id`,`role_id`),
  
  KEY `FK_ROLE_idx` (`role_id`),
  
  CONSTRAINT `FK_USER_05` FOREIGN KEY (`user_id`) 
  REFERENCES `user` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION,
  
  CONSTRAINT `FK_ROLE` FOREIGN KEY (`role_id`) 
  REFERENCES `role` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;

--
-- Dumping data for table `users_roles`
--

INSERT INTO `users_roles` (user_id,role_id)
VALUES 
(1, 1),
(1, 2),
(2, 1),
(2, 2),
(3, 1),
(3, 2)

