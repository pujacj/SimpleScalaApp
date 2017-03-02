package com.hm.routes

import spray.json.JsString
import spray.routing.HttpService
import spray.json._
import scala.collection.mutable.ArrayBuffer
import java.util.Scanner

/**
  * Created by pooja on 2/17/17.
  * */

trait TodoHandler extends HttpService{

  val a: ArrayBuffer[Int] = ArrayBuffer(45, 30, 12, 10)
  println(s"Elements of arrayBuffer = $a")

  println("Enter an option 1. Add..2. Delete..3.Test..")
  val input : Int = readInt()

  input match {
    case 1 => println(s"You have chosen option $input : Add")
              add()
    case 2 => println(s"You have chosen option $input : Delete")
              deleteElement()
    case 3 => println(s"You have chosen option $input : Test")
              test()
  }


  def add() = {
    println("Enter the element to be added")
    val i: Int = readInt()
    a += i
    println(s"Elements of arrayBuffer = $a")

  }

   def deleteElement() = {
     println("Enter the element to be deleted")
     val i: Int = readInt()
     a -= i
     println(s"Elements of arrayBuffer = $a")
   }

   def test(): Unit =
  {
    println("Enter the element to be tested")
    val i: Int = readInt()
    val filter1 = a.filter(_>i) //finds out all numbers greater than the given number


    val b = filter1.sorted
    //println(s"Elements of arrayBuffer = $b")
    val greatest = b.min
    println(s"The element greater than the given number is = $greatest")

    val filter2 = a.filter(_<i) //finds out all numbers smaller than the given number
    val c = filter2.sorted

    val smallest = c.max
    println(s"The element smaller than the given number is = $smallest")
  }




}
