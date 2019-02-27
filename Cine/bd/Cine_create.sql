create database CineVG
go
use CineVG
go
CREATE TABLE Cliente (
    idCli int primary key identity(1,1),
    nomCli varchar(30) NOT NULL,
    apeCli varchar(80) NOT NULL,
    nacCli date NOT NULL    
)
go
-- Table: Pelicula
CREATE TABLE Pelicula (
    idPeli int primary key identity(1,1),
    genPeli varchar(50), --NOT NULL COMMENT 'genero',
    idiPeli varchar(50), --NOT NULL COMMENT 'idioma',
    durPeli time, --NOT NULL COMMENT 'duracion',
    tipPeli char(1), --NOT NULL COMMENT 'tipo: doblada o subtitulada',
    claPeli char(1), -- NOT NULL    
)
go
-- Table: Personal
CREATE TABLE Personal (
    idPer int primary key identity(1,1),
    nomPer varchar(50) NOT NULL,
    apePer varchar(80) NOT NULL,
    dniPer char(8) NOT NULL,
    dirPer varchar(80) ,
    tipPer int NOT NULL, --COMMENT 'tipo de personal: 1: administrador, 2: empleado',
    sexPer char(1) NOT NULL,
    usuPer char(4) NOT NULL,
    pwdPer varchar(50) NOT NULL,
	ubiPer char(6)    
)
go

-- Table: Sala
CREATE TABLE Sala (
    idSala int primary key identity(1,1),
    numSala int NOT NULL,
    capSala int NOT NULL  
)

go
-- Table: Tablero
CREATE TABLE Tablero (
    idTabl int primary key identity(1,1),
    precPeli decimal(4,2),
    fechPeli date ,
    edadPer int     
)
go
-- Table: Ubigeo
CREATE TABLE Ubigeo (
    idUbi char(6) PRIMARY KEY,
    dptoUbi varchar(30) NOT NULL,
    provUbi varchar(50) NOT NULL,
    distUbi varchar(80) NOT NULL    
)
go

-- Table: Venta
CREATE TABLE Venta (
    idVta int PRIMARY KEY identity(1,1),
    idCli int NOT NULL,
    idPeli int NOT NULL,
    totEnt int --NOT NULL COMMENT 'cantidad de entradas',
)
go
-- Table: detPelicula
CREATE TABLE detPelicula (
    idDetPeli int PRIMARY KEY identity(1,1) not null,
    idPeli int NOT NULL,
    idSala int NOT NULL,
    horaPeli time NOT NULL,
    fechPeli date NOT NULL,
    idPer int NOT NULL    
)
go

-- Table: detVenta
CREATE TABLE detVenta (
    idDetVta int PRIMARY KEY identity(1,1) not null,
    idTabl int NOT NULL,
    idVta int NOT NULL,
    cantVta int NOT NULL
)



