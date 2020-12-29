USE `happy_tails_db`;
DROP TABLE IF EXISTS `dogdata`;

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

-- LOAD DATA LOCAL INFILE 'C:\Users\ketki\OneDrive\Desktop\new_happy_tail_raw_data_modifieddogdata.csv' 
-- INTO TABLE dogdata 
-- FIELDS TERMINATED BY ',' 
-- LINES TERMINATED BY '\r\n'
-- IGNORE 1 ROWS;