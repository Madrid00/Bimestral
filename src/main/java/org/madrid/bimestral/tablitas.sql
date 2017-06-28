/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  T-
 * Created: 30/05/2017
 */

create table direccion(id integer primary key auto_increment, 
numero integer ,calle varchar(40),cp integer, municipio varchar(40));

create table SalaCine(id_sala integer primary key auto_increment,
tituloPelicula varchar(80), clasificacion varchar(20), 
num_acientos integer);

create table Boleto(id_boleto integer primary key auto_increment, 
id_sala integer, costoBoleto float, foreign key (id_sala) references salacine(id_sala));

describe SalaCine;

