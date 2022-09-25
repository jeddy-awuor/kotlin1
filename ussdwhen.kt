fun main(args: Array<String>) {
    println("Please Enter")
    var number= readln()!!.toInt()
    when(number){
        0-> println("Nyakua Bonus")
        1-> println("My Data Deals")
        2-> println("Daily Bundles New")
        3-> println("Weekly Bundles New")
        4-> println("Monthly Bundles")
        5-> println("No Expiry")
        6-> println("Entertainment Bundles")
        7-> println("Okoa Data")
        8-> println("Lipa Mdogo Mdogo")
        else-> println("Invalid Characters")
    }

}