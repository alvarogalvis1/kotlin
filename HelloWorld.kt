data class Language(val name: String);

fun repeat(word:String, times: Int){
    var i=0;
    while(i< times){
        println(word);
        i++;
    }
}

fun printSum(a: Int, b: Int){
    val sum = a + b;
    println("La suma de ${a} más ${b} es ${sum}");
    println("The sum of ${a} plus ${b} is equal to ${sum}");
    
}

fun printHello()= println("Hello!");

fun main(args: Array<String>) {
    repeat("Hello, world!!!", 5);
    printSum(9,6);
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
La suma de 9 más 6 es 15
The sum of 9 plus 6 is equal to 15
Kotlin
Hello!

*/
