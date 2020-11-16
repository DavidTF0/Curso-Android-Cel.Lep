

fun main(){


    /* 01 - Desenvolva um algoritmo que armazene seu nome em uma variável e imprima a mensagem "Olá, [nome]"
    utilizando a Concatenação ou Template String */

    var nome:String = "David"
    println("Olá, $nome")

    /* 02 - Desenvolva um algoritmo com duas variáveis do tipo Double e imprima a soma das mesmas */
    var numero01: Double = 2.5
    var numero02: Double = 3.9
    var resultadoEx02: Double = 0.0
    resultadoEx02 = numero01 + numero02

    println("A soma de $numero01 + $numero02 = $resultadoEx02 " )

    /* 03 - Desenvolva um algoritmo que imprima o valor ao quadrado de um número */
    var valor: Int = 2
    var resultadoEx03 = valor*valor

    println("O quadrado de um numero $valor é $resultadoEx03")

    /* 04 - Desenvolva um algoritmo que imprima o dobro de um número */
    var dobro: Int = 2
    var numeroAleatorio01: Int = 3
    var resultadoEx04 = numeroAleatorio01 * dobro
    println("O dobro de $numeroAleatorio01 é $resultadoEx04 ")

    /* 05 - Desenvolva um algoritmo que utilize os operadores aritméticos e imprima o
    antecessor e o sucessor de um número
    */

    var numeroAleatorio02: Int = 5
    var antecessor = numeroAleatorio02 - 1
    var sucessor = numeroAleatorio02 + 1
    println("O antecessor de $numeroAleatorio02 é $antecessor, o suscessor de $numeroAleatorio02 é $sucessor")

    /* 06 - Desenvolva um algoritmo que calcule e imprima o total de dias em 7 meses
     considerando que cada mês tenha 30 dias
     */

    var meses: Int = 7
    var calculaMes = 30 * 7
    println("O total de dias em $meses meses é de $calculaMes dias")

    /* 07 - Desenvolva um algoritmo que calcule e imprima a média das cinco notas de um aluno */

    var nota01:Double = 9.5
    var nota02:Double = 6.5
    var nota03:Double = 4.3
    var nota04:Double = 7.5
    var nota05:Double = 5.5
    var media = (nota01 + nota02 + nota03 + nota04 + nota05) / 5.0

    println("A media do aluno é $media")

    /* 08 - Desenvolva um algoritmo que converta metros para centímetros e imprima o resultado */

    var metros: Int = 10
    var centrimetros = metros * 100

    println("A conversão de $metros m para centimetros. É de $centrimetros cm")

    /* 09 - Desenvolva um algoritmo que calcule o desconto na venda de um produto*/

    var valorDeDescontoEmPorcentagem: Double = 10.0
    var precoDoProduto: Double = 1000.00
    var desconto = (100 - valorDeDescontoEmPorcentagem)/100.0
    var precoDoProdutoComDesconto = desconto * precoDoProduto

    println("O valor do produto com o desconto de $valorDeDescontoEmPorcentagem%, é de R$$precoDoProdutoComDesconto")

}