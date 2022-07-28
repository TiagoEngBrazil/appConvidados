package com.example.convidados.constants

class DataBasesConstants private constructor() {

    object Guest {

        const val ID= "Guestid"
        const val TABLE_NAME = "Guest"

        object COLUMNS {
            const val ID = "id"
            const val NAME = "name"
            const val PRESENCE = "presence"
        }
    }

}