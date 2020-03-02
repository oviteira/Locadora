DROP SCHEMA IF EXISTS `locadora`;

CREATE SCHEMA IF NOT EXISTS `locadora`;

USE `locadora` ;

DROP TABLE IF EXISTS `cliente`;
DROP TABLE IF EXISTS `agencia`;
DROP TABLE IF EXISTS `carro`;
DROP TABLE IF EXISTS `reserva` ;

CREATE TABLE IF NOT EXISTS `cliente` (
    `clienteID`    BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `clienteNome`  VARCHAR(100) NOT NULL,
    `clienteCPF`   VARCHAR(14)  NOT NULL,
    `clienteTel`   VARCHAR(15)  NOT NULL,
    `clienteEmail` VARCHAR(100) NOT NULL,
    `clienteFiel`  VARCHAR(3)   NOT NULL
);

CREATE TABLE IF NOT EXISTS `agencia` (
    `agenciaID`               BIGINT      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `agenciaNome`             VARCHAR(8)  NOT NULL,
    `agenciaTipo`             VARCHAR(9)  NOT NULL,
    `agenciaValorRegularUtil` DOUBLE(5,2) NOT NULL,
    `agenciaValorFielUtil`    DOUBLE(5,2) NOT NULL,
    `agenciaValorRegularFDS`  DOUBLE(5,2) NOT NULL,
    `agenciaValorFielFDS`     DOUBLE(5,2) NOT NULL
);

CREATE TABLE IF NOT EXISTS `carro` (
    `carroID`           BIGINT      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `carroNome`         VARCHAR(45) NOT NULL,
    
    `agenciaID`         BIGINT      NOT NULL
);

CREATE TABLE IF NOT EXISTS `reserva` (
    `reservaID`      BIGINT      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `dataRetirada`   date        NOT NULL,
    `dataDevolucao`  date        NOT NULL,
    `carroAlugado`   VARCHAR(3)  DEFAULT "Não",
    `carroReservado` VARCHAR(3)  DEFAULT "Não",
    
    `clienteID`      BIGINT      NOT NULL,
    `carroID`        BIGINT      NOT NULL
);

ALTER TABLE carro ADD CONSTRAINT `agenciaID` FOREIGN KEY (`agenciaID`) REFERENCES `agencia`(`agenciaID`) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE reserva ADD CONSTRAINT `clienteID` FOREIGN KEY (`clienteID`) REFERENCES `cliente`(`clienteID`) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE reserva ADD CONSTRAINT `carroID` FOREIGN KEY (`carroID`) REFERENCES `carro` (`carroID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

INSERT INTO `agencia` (`agenciaNome`,`agenciaTipo`,`agenciaValorRegularUtil`,`agenciaValorFielUtil`,`agenciaValorRegularFDS`,`agenciaValorFielFDS`) VALUES ('NorthCar', 'SUV', 630.00, 590.00, 600.00, 590.00), ('SouthCar', 'Compacto', 210.00, 150.00, 200.00, 90.00), ('WestCar', 'Esportivo', 530.00, 150.00, 200.00, 90.00);