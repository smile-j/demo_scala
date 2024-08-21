package com.demo.scala.chapter03

object Scala09_Object_Enum {

  /**
    * 枚举
    */

  def main(args: Array[String]): Unit = {

      println(Color.Blue)
      println(Color.Red)
  }

  object Color extends Enumeration{

    val Red = Value(1,"red")
    val Yellow = Value(2,"yellow")
    val Blue = Value(3,"blue")

  }

}
