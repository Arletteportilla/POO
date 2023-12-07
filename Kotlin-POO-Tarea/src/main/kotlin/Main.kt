fun main(args: Array<String>) {
    // Creamos diferentes instancias de la clase Persona
    val persona1 = Persona("Cesar", 36, "Estudainte")
    val persona2 = Persona("Karla", 34, "Doctora")
    val persona3 = Persona("Ramiro", 2, "Ingeniero")

    // Mostramos las descripciones de las personas
    println("Descripción de Persona 1:")
    persona1.mostrarDescripcion()

    println("\nDescripción de Persona 2:")
    persona2.mostrarDescripcion()

    println("\nDescripción de Persona 3:")
    persona3.mostrarDescripcion()
}
fun main() {
    // Crear una lista de animales de diferentes tipos
    val listaAnimales = listOf(
        Animal("AnimalGenérico", 5),
        Perro("", 3),
        Gato("Whiskers", 2)
    )

    // Recorrer la lista y llamar al método hacerSonido() para cada animal
    for (animal in listaAnimales) {
        println("${animal.nombre} (${animal.edad} años):")
        animal.hacerSonido()
        println() // Salto de línea para mejor legibilidad
    }//
    // creamos objetos
    fun main() {
        val miCoche = Coche()
        miCoche.acelerar()

        val miBicicleta = Bicicleta()
        miBicicleta.acelerar()

        val miCirculo = Circulo(5.0)
        println("Área del círculo: ${miCirculo.area}")
        miCirculo.dibujar()

        val miCuadrado = Cuadrado(4.0)
        println("Área del cuadrado: ${miCuadrado.area}")
        miCuadrado.dibujar()
    }
}
