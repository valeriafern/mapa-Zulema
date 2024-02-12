/*package com.example.coneccionbd.Modem

class Constantes {


    //sirve para que mis variables constantes sean globales
    companion object{

        const val NOM_BD ="Maps"
        const val VERSION_BD= 3

        const val TABLA = "Create table ciudad(cod int, nombre text ,coddep int )"

        const val TABLA2 ="Create table datos(cod int, nombre text, apellido text, telefono int,  direccion text," +
                "ciudad text)"

        const val TABLA3 =
            "Create table maps (id INTEGER PRIMARY KEY AUTOINCREMENT, titulo TEXT, latitud REAL, longitud REAL)"
    }
}*/

package com.example.coneccionbd.Modem

class Constantes {
    companion object {
        const val NOM_BD = "Maps"
        const val VERSION_BD = 3

        const val TABLA_MAPS =
            "CREATE TABLE maps (id INTEGER PRIMARY KEY AUTOINCREMENT, titulo TEXT, latitud REAL, longitud REAL)"
    }
}

