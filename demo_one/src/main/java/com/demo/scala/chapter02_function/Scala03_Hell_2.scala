package com.demo.scala.chapter02_function

object Scala03_Hell_2 {

  /**
    * 函数加深版本
    *
    * scala完全面向对象的语言，所以万物皆对象
    * scala语言是完全面向函数式编程语言，所以万物皆函数
    */

  def main(args: Array[String]): Unit = {

    /**
      * 将函数对象作为参数使用
      */
    def fun():Unit={
        println("test fun ")
    }

    def test(f:()=>Unit):Unit={
        f()
    }

    /**
      * 使用下划线的目的是为了不让函数执行，而是将它作为对象使用
      * 那么如果明确知道函数不执行，那么下划线可以不加
      */
    val f = fun _
    test(fun)
    test(f)

    def test2(f:(Int,Int)=>Int):Unit={
      val result = f(10,20);
      println(result)
    }
    def sum(x:Int,y:Int):Int={
        x+y
    }
    def diff(x:Int,y:Int):Int={
      x-y
    }
    test2(sum)
    test2(diff _)
    //匿名函数
    test2( (x:Int,y:Int)=>{
      x*y
    })
    //1.如果逻辑代码只有一行，那么大括号可以省略
    test2( (x:Int,y:Int)=> x*y)
    //2.匿名函数的参数类型如果可以推断出来，那么参数类型也可以省略
    test2( (x,y)=> x*y)
    //3.匿名函数参数列表只有一个，那么小括号可以省略
    //4.匿名函数中如果参数按照顺序只执行一次的场合，那么可以使用下划线代替参数，省略参数列表和箭头
    test2(_ * _)

    //参数列表只有一个参数
    def test3(f:(String)=>Unit):Unit={
      f("zhangsan")
    }
    test3((a:String)=>{
      println(a)
    })
    test3(a=>println(a))
    //最简写法
    test3(println(_))


    def test4(f:(Int,Int)=>Int,a:Int=10,b:Int=20):Unit={
      val result = f(a,b);
      println(s"result:${result}")
    }
    test4(_ * _ ,40,20)
  }

}
