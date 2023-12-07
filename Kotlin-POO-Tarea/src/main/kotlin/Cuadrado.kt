class Cuadrado(val lado: Double) : Forma() {
    override val area: Double
        get() = lado * lado

    override fun dibujar() {
        println("Dibujando un cuadrado" )
    }

}