package edu.knoldus

import java.io.{File, PrintWriter}

import org.apache.log4j.Logger
import org.json4s.DefaultFormats
// import org.json4s.jackson.JsonMethods._
import org.json4s.jackson.Serialization._

import scala.io.Source

object PersonDetails extends App {

  val log = Logger.getLogger(getClass)
  implicit val formats = DefaultFormats

  val name = "Nancy Jain"
  val age = 24
  val day = "Sunday"
  val salary = 12000
  val luckyNumber = 8
  val houseNo = "43"
  val street = "13"
  val address = new Address(houseNo, street)

  val personDetails = new Person(name, age, day, salary, luckyNumber, address)

  //Writing to the file
  val detailsInFile = write(personDetails)
  val file = new File("/home/knoldus/IdeaProjects/assignment-scala03-1/nancy.txt")
  val writeToFile = new PrintWriter(file)
  writeToFile.write(detailsInFile)
  writeToFile.close()
  //Reading from the file
  val reader = Source.fromFile("/home/knoldus/IdeaProjects/assignment-scala03-1/nancy.txt")
  reader.foreach(data => log.info(data))

}
