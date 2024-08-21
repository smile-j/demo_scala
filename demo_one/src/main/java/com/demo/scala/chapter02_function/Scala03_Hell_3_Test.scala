package com.demo.scala.chapter02_function

object Scala03_Hell_3_Test {

  /**
    * 计算器
    */

  def main(args: Array[String]): Unit = {

    def calc(a: Int,f:(Int,Int)=>Int,b:Int): Int ={
        f(a,b)
    }

    def sum(a: Int,b:Int):Int={
      a+b
    }
    val res = calc(10,sum,20)
    println(res)
    calc(10,_ + _,20)

  }

}
