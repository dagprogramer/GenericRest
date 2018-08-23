-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema baseRest
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `baseRest` ;

-- -----------------------------------------------------
-- Schema baseRest
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `baseRest` DEFAULT CHARACTER SET utf8 ;
USE `baseRest` ;

-- -----------------------------------------------------
-- Table `baseRest`.`city`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `baseRest`.`city` ;

CREATE TABLE IF NOT EXISTS `baseRest`.`city` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) CHARACTER SET 'latin1' NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `baseRest`.`status_user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `baseRest`.`status_user` ;

CREATE TABLE IF NOT EXISTS `baseRest`.`status_user` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `status` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `baseRest`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `baseRest`.`user` ;

CREATE TABLE IF NOT EXISTS `baseRest`.`user` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) CHARACTER SET 'latin1' NOT NULL,
  `email` VARCHAR(45) CHARACTER SET 'latin1' NOT NULL,
  `password` VARCHAR(45) CHARACTER SET 'latin1' NULL,
  `city_id` INT UNSIGNED NOT NULL,
  `status_user_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_user_city_idx` (`city_id` ASC),
  INDEX `fk_user_status_user1_idx` (`status_user_id` ASC),
  CONSTRAINT `fk_user_city`
    FOREIGN KEY (`city_id`)
    REFERENCES `baseRest`.`city` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_status_user1`
    FOREIGN KEY (`status_user_id`)
    REFERENCES `baseRest`.`status_user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
