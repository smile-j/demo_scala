package com.demo.scala.chapter02_function

import scala.Boolean

object Scala12_Test {

  /**
    *
    *
    */

  def main(args: Array[String]): Unit = {

    //1.test(10,20,_+_)
    def fun(x:Int,y:Int): Int ={
        x+y
    }
    def test(x:Int,y:Int,f:(Int,Int)=>Int):Int={
      f(x,y)
    }
    test(10,20,(a:Int,b:Int)=>{a+b})
    println(test(10,20,fun))
    //2.test1(_.substring(0,1))
    def fun1(name:String):String={
      name.substring(0,1)
    }
    def test1(f:(String)=>String): String ={
      f("zhangsan")
    }
    test1((str:String)=>str.substring(0,1))
    test1(fun1)
    //3.test2(_ * 2)
    def fun2(x:Int):Int={
      x*2
    }
    def test2(f:(Int)=>Int):Int={
      f(10)
    }
    test2(fun2)

    //字符串也有乘法的能力
    val name ="zhangsan"
    val newName = name*2
    println(newName)

    //控制抽象可以实现自定义语法
    def myWhile(cond: => Boolean)(op: => Unit):Unit={
        if(cond){
          op
          myWhile(cond)(op)
        }
    }

    var age =18
    myWhile(age<=20){
      println("age:"+age)
      age = age+1
    }

  }

}
