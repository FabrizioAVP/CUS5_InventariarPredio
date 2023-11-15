package com.example.inventariarpredio20.data.tables

import com.example.inventariarpredio20.data.tables.CasaTable.autoIncrement
import com.example.inventariarpredio20.data.tables.CasaTable.nullable
import org.jetbrains.exposed.sql.Table

object PredioMDUTable : Table("predio_mdu") {
    val idPredioMDU = integer("id_predio_mdu").autoIncrement()
    val idPredio = PredioTable.integer("id_predio")
    val idMDU = MDUTable.integer("id_mdu")
    val descripcion = varchar("descripcion", length = 4)
    val direccion = varchar("direccion", length = 255)
    val numero = char("piso", length = 10)
    val totalCasas = integer("total_casas")

    override val primaryKey = PrimaryKey(idPredioMDU)
}