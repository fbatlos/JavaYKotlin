package org.example.Java.Final

fun main() {
    val combate = Combate()
    combate.Inicio()
}

class Combate{
    val goku = Personaje("Goku",25,5)
    val vegeta = Personaje("Vegeta",25,6)

    fun Inicio(){
        while (goku.vida > 0 && vegeta.vida > 0){
            goku.vida -= vegeta.ataque
            vegeta.vida -= goku.ataque
            println("Vida goku ${goku.vida}")
            println("Vegeta ${vegeta.vida}")
        }

        if (vegeta.vida > 0){
            println(" win Vegeta ${vegeta.vida}")
        }else{
            println("win Goku ${goku.vida}")
        }
    }

}




class Personaje(val name: String, var vida:Int, val ataque:Int)