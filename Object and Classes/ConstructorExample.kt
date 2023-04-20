fun main() {

    val person1 = Person("Aditya", 22)

    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")
}

class Person(val firstName: String, var age: Int) {

}
