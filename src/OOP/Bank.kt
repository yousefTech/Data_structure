package OOP
class Bank{
    var curentbalance:Double = 0.0
    var accountid:Int = 0

    constructor(accountid: Int,curentbalance: Double) {
        this.accountid = accountid
        this.curentbalance = curentbalance

    }
    constructor(){
        this.accountid=0
        this.curentbalance=0.0
    }


    fun withdraw(obj:Bank,ammount:Double){
        if(obj.accountid!=0&&obj.curentbalance>0.0)
            if(obj.curentbalance<ammount)
                println("Sorry your Balance is Low, Please recharge your account")
        else{
            obj.curentbalance-=ammount
                println("Your balance know is ${obj.curentbalance}")
                println("Thanks!")
            }
    }
    fun deposit(obj:Bank,ammount:Double){
        if(obj.accountid!=0&&obj.curentbalance>=0.0)
            obj.curentbalance +=ammount

    }

    override fun toString(): String {
        return "Bank(curentbalance=$curentbalance, accountid=$accountid)"
    }


}
fun main(){
    var yousef = Bank();
    var mohammed = Bank(1515,1500.0)
    var shrooq = Bank(1717,200.0)
    yousef.deposit(mohammed,200.0)
    yousef.deposit(shrooq,2000.50)
    yousef.withdraw(shrooq,750.0)
    println(shrooq.toString())
}

