import kotlin.io.readln as readln1

fun main(args: Array<String>) {
    println("Digite o primeiro número: ")
    val num1 = readln1().toInt()
    println("Digite o segundo número: ")
    val num2 =  readln1().toInt()
    println("Digite o terceiro número: ")
    val num3 = readln1().toInt()
    if (num1>num2 && num1>num3){
        print("O primeiro número é o maior: $num1 ")
    } else if (num2>num1 && num2>num3){
        print("O segundo número é o maio: $num2")
    }else if (num3>num1&& num3>num2){
        print("O terceiro número é o maior: $num3")
    }
}