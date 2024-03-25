//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
// Q1.
    sentence("Barnie bakes brown bagels and buns")

//    Q2.
    var arra = arrayOf(2.0,3.0,6.0,8.0,12.0,23.0,17.0)
println(calculate(arra))

    println("Q2 using class")
    var nums = arrayOf(3.0,4.0,6.0,9.0,0.0,2.0)
     var z = calculate()
    println(z.addition(nums))
    println(z.counting(nums ))
    println(z.averageOfNumbers(nums))

//    Q3.
    volume(20.0)

//  Q4.
   println(isPalindrome("latifa"))
    println(isPalindrome("madam"))

}

//Q1. Write and invoke a function that given the string “Barnie bakes
// brown bagels and buns” prints out a list of all the other words and
// characters making up the string excluding all possible occurrences of
// the letter b.

fun sentence(word: String){
    var result = word.split("b","B")
    println(result)

}

//Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.


fun calculate(numbers: Array<Double>): String{
var numbersCount= numbers.count()
    var averageOfNumbers= numbers.average()
    var numbersAdd = numbers.sum()

    return ("the sum() = $numbersAdd, count()= $numbersCount, average() = $averageOfNumbers")
}

class calculate (){
    fun addition(numbers: Array<Double>){
        var numbersAdd = numbers.sum()
    }

    fun counting(numbers: Array<Double>){
        var numbersCount= numbers.count()
    }
    fun averageOfNumbers(numbers: Array<Double>){
        var averageOfNumbers= numbers.average()
    }
}


//The volume of a sphere is calculated using the formula below
//V = 4/3 π r3
//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π


fun volume (radius: Double){
    val pi = 3.14159
    val constant: Double = (4.0/3)
    var volumeCalculated = constant*pi*radius*radius*radius
    println("the volume of the sphere is: $volumeCalculated")
}

//A palindrome is a string that reads the same forwards and backwards e.g
//madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the
//word is a palindrome.

fun isPalindrome(word: String): Boolean{
    var newWord = word.reversed()

    if (newWord == word){
        return (true)
    }
    else
    {
        return (false)
    }





}