package edu.knoldus

@SerialVersionUID(1000)
class Person(val name: String, val age: Int,
             @transient val day: String,
             val salary: Float,
             @transient val luckyNumber: Int,
             val address: Address) extends Serializable {
  override def toString: String = {
    s"Name = $name\nAge = $age\nDay = $day\nSalary = $salary\nLucky number = $luckyNumber"
  }
}

@SerialVersionUID(1001)
class Address(val houseNumber: String, val street: String) {
  override def toString: String = {
    s"\nHouse Number = $houseNumber\nStreet = $street"
  }
}
