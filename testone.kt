fun main(args: Array<String>) {
    println("Please enter your age!")
    var age= readln()!!.toInt()
    if (age>=18){
        println("Ahoy!Welcome onboard!")
    }
    else{
        println("Sorry, you're too young to use this app :(")
    }

}

