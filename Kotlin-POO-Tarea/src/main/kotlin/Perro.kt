class Perro (nombre: String, edad: Int) : Animal(nombre, edad) {
        override fun hacerSonido() {
            println("El perro ladra: ¡Guau, guau!")
        }
    }
