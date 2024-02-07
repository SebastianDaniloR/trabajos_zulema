package com.example.myapplication.model

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase

class ManagerBd(val context: Context) {

    private lateinit var bd: SQLiteDatabase

    private val bdHelper = BdHelper(context)

    fun openBdWr() {
        bd = bdHelper.writableDatabase
    }

    fun openBdRd() {
        bd = bdHelper.readableDatabase
    }

    fun insertData(): Long {
        openBdWr()

        val contenedor = ContentValues().apply {
            put("cod", 1)
            put("nombre", "cali")
            put("cod_dep", 25)
        }

        val result = bd.insert("ciudad", null, contenedor)
        bd.close() // Cerrar la base de datos después de insertar
        return result
    }
}
