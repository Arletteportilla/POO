class Circulo(val radio: Double): Forma() {
    override val area: Double
        get() = 3.14 *radio * radio

    override fun dibujar() {
        println("Dibujando un circulo")
        TODO("Not yet implemented")
    }
}