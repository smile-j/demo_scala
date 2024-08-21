package com.demo.scala.chapter05_collection

object Scala08_Option {

  def main(args: Array[String]): Unit = {

    val opt1 = Some(10)
    val opt2 = Option(10)
    val opt3 = None
    val opt4 = Option(null)

    println(opt1)
    println(opt2)
    println(opt3)
    println(opt4.getOrElse(-1))

    println("*"*10)
    val nil = Nil
    println(nil.length)

  }

}
