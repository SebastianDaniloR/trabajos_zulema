package com.example.myapplication.model

class Constantes {
    //Sirve para que mis constantes sean globales
    companion object{
        const val NOM_DB = "BdPrueba1"
        const val VERSION_BD = 2
        const val TABLA ="create table ciudad(cod int, nombre text, cod_dep int)"
        const val TABLA2 = "create table trabajo(cod int, nombre_empresa text, telefono int)"
    }
}