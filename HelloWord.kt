
fun main(args: Array<String>) {
    repeat("Hello, world!!!", 5);
    printSum(3,6);
    val language = Language("Kotlin");
    println(language.name);
    printHello();
    
}

fun repeat(word:String, times: Int){
    var i=0;
    while(i< times){
        println(word);
        i++;
    }
}

fun printSum(a: Int, b: Int){
    println("La suma de ${a} más ${b} es ${a+b}");
}

fun printHello()= println("Hello!");



data class Language(val name: String);
