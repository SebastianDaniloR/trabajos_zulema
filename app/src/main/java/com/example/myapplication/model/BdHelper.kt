package com.example.myapplication.model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.lifecycle.viewmodel.viewModelFactory
import kotlinx.coroutines.channels.Channel

class BdHelper(
    context: Context,

) : SQLiteOpenHelper(context, Constantes.NOM_DB, null, Constantes.VERSION_BD) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(Constantes.TABLA)
       // db?.execSQL(Constantes.TABLA2)

    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        // Puedes implementar la lógica de actualización aquí si es necesario
       db?.execSQL("DROP TABLE IF EXISTS ciudad")
        onCreate(db)
    }
}
