package com.example.inventariarpredio20.data.repository

import com.example.inventariarpredio20.data.conexion.db
import com.example.inventariarpredio20.data.tables.MDUTable
import com.example.inventariarpredio20.data.tables.PredioTable
import org.jetbrains.exposed.sql.selectAll

object MDURepository {

    suspend fun obtenerTipoMDU(): List<String> {
        return db.dbQuery {
            MDUTable.selectAll()
                .orderBy(MDUTable.idMDU)
                .map { it[MDUTable.descripcion] }
        }
    }
}