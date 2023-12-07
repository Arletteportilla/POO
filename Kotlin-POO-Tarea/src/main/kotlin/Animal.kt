open class Animal (val nombre: String, val edad: Int) {
        // Método común para todos los animales
        open fun hacerSonido() {
            println("El animal hace un sonido genérico.")
        }
    }
