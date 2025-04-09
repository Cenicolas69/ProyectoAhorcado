
CREATE DATABASE IF NOT EXISTS JuegoPalabrasDB;
USE JuegoPalabrasDB;


CREATE TABLE Usuario (
    Numero INT PRIMARY KEY,
    Nombre VARCHAR(100),
    Apellido VARCHAR(100),
    Apellido2 VARCHAR(100)
);


CREATE TABLE Admin (
    Numero INT PRIMARY KEY,
    Nivel INT,
    FOREIGN KEY (Numero) REFERENCES Usuario(Numero)
);


CREATE TABLE Jugador (
    Numero INT PRIMARY KEY,
    Cuota DECIMAL(10,2),
    FOREIGN KEY (Numero) REFERENCES Usuario(Numero)
);


CREATE TABLE Juegos (
    idJuego INT PRIMARY KEY,
    Idioma VARCHAR(50),
    horaSistema TIME,
    fechaSistema DATE
);


CREATE TABLE PalabraFrase (
    idPartida INT PRIMARY KEY,
    Idioma VARCHAR(50),
    Nombre VARCHAR(255)
);


CREATE TABLE Partida (
    Numero INT,
    idJuego INT,
    idPalabra INT,
    registroPuntaje INT,
    duracionPartida INT,
    clasificacionesFinales TEXT,
    PRIMARY KEY (Numero, idJuego, idPalabra),
    FOREIGN KEY (Numero) REFERENCES Jugador(Numero),
    FOREIGN KEY (idJuego) REFERENCES Juegos(idJuego),
    FOREIGN KEY (idPalabra) REFERENCES PalabraFrase(idPartida)
);


CREATE TABLE Historico (
    idPalabra INT PRIMARY KEY,
    Idioma VARCHAR(50),
    nombre VARCHAR(255),
    PalabraFrase TEXT,
    FOREIGN KEY (idPalabra) REFERENCES PalabraFrase(idPartida)
);

CREATE TABLE Sinonimo (
    idSinonimo INT PRIMARY KEY,
    idPalabra INT,
    FOREIGN KEY (idPalabra) REFERENCES PalabraFrase(idPartida)
);
