create database ideal;
use ideal;

create table cliente (
	codigo int primary key auto_increment,
	nome varchar (50),
	telefone varchar (20),
    endereco varchar (50),
    email varchar (50)
);

create table usuario (
	codigo int primary key auto_increment,
	nome varchar (50),
	usuario varchar (20),
    senha varchar (8)
);
