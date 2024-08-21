package com.demo.scala.chapter02_function

object Scala08_Closure {


  def main(args: Array[String]): Unit = {

    /**
      * 闭包
      * scala 2.12版本前，闭包使用的是匿名函数类实现的
      * scala 2.12版本后，闭包使用的是改变函数的声明完成的
      */

    def outer(a:Int)  ={
        def inner(b:Int) ={
          a+b
        }
      inner _
    }
    val res = outer(10)(20)
    println(res)

    val name ="zhnagsan"
    def test()={
      println(name)
    }
    val f = test _
    f()

    /**
      * 总结：闭包的场景
      * 1.内部函数使用了外部的数据，改变了数据的生命周期
      * 2.将函数作为对象使用，改变了函数本身的生命周期
      * 3.所有的匿名函数都有闭包
      * 4.内部返回到外部使用也会有闭包
      *
      */
  }

}
