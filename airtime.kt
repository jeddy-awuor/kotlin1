fun main(args: Array<String>) {
    println("Enter your total marks")
    var marks= readln()!!.toInt()
    if (marks>=0&& marks<=32){
        println("You scored a D")
    }
    else if (marks>=33&& marks<=39){
        println("You scored a C")
    }
    else if (marks>=40&& marks<=49){
        println("You scored a B-")
    }
    else if (marks>=50&& marks<=59){
        println("You scored a B")
    }
    else if (marks>=60&& marks<=69){
        println("You scored a B+")
    } else if (marks>=70&& marks<=79){
        println("You scored an A-")
    } else if (marks>=80&& marks<=100) {
        println("You scored an A")
    }
    else{
        println("Invalid")
    }


}