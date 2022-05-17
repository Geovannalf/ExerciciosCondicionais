fun main(args: Array<String>) {
    print("Digite sua idade:")
    val idade = readln().toInt()
    if(idade in 10..14){
        println("Categoria Infantil")
    }else if(idade in 15..17){
        println("Categoria Juvenil")
    }else if(idade in 18..25){
        println("Categoria Adulto")
    } else {
        println("Sem categoria")

    }
}