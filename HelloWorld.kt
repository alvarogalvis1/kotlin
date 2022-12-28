data class Language(val name: String);

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

fun main(args: Array<String>) {
    repeat("Hello, world!!!", 5);
    printSum(3,6);
    val language = Language("Kotlin");
    println(language.name);
    printHello();
    
}



// Output:
/*
Hello, world!!!
Hello, world!!!
Hello, world!!!
Hello, world!!!
Hello, world!!!
La suma de 3 más 6 es 9
Kotlin
Hello!

*/
