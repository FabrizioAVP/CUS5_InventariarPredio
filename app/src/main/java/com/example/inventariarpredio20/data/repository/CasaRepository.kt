package com.example.inventariarpredio20.data.repository

import com.example.inventariarpredio20.data.conexion.db
import com.example.inventariarpredio20.data.tables.CasaEstadoTable
import com.example.inventariarpredio20.data.tables.MDUTable
import org.jetbrains.exposed.sql.selectAll

object CasaRepository {
    suspend fun obtenerEstadoCasa(): List<String> {
        return db.dbQuery {
            CasaEstadoTable.selectAll()
                .orderBy(CasaEstadoTable.idEstado)
                .map { it[CasaEstadoTable.descripcion] }
        }
    }
}