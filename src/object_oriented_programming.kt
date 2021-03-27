fun main(){
var person=Human("Tabitha",19,50.5)
    person.eat(5)
    person.speak("I do")
   person.birthday()

    var details=Human.User("Tabitha","Mutinda","tabbithamutinda@gmail.com","0740918287",25654)
    println(details.email)
    println(details.firstName)
}

class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Int){
       println("I am eating $foodWeight kgs of food.")

    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday():Int{
        age+=1
        println(age)
        return(age)

    }

    data class User(val firstName:String,val lastName:String,val email:String,val phoneNumber:String,val password:Int){

    }
}