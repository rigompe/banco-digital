package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "ricardo"
    var cpf: String = "229.183.117-11"
    private set

    constructor()

    fun pessoainfo() = "$nome e $cpf"
}

fun main() {
    val ricardo = Pessoa()

    println(ricardo.pessoainfo())

}