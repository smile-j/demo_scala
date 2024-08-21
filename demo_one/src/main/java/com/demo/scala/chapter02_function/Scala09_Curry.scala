package com.demo.scala.chapter02_function

object Scala09_Curry {


  def main(args: Array[String]): Unit = {

    /**
      * 函数柯里化
      *
      */
    def test(a:Int,b:Int):Unit={
      for (i<- 1 to a){
        println(i)
      }
      for (i <- 1 to b){
        println(i)
      }
    }

    val a=3//3分钟
    val b=5 //5分钟
    //函数的参数之间可能没有关系，那么如果在传值的时候，同时传递，其实就有耦合性
    //所谓柯里化，就是将无关的参数分离，可以设定多个参数列表
//    test(a,b)
    def test1(a:Int)(b:Int):Unit={
      for (i<- 1 to a){
        println(i)
      }
      for (i <- 1 to b){
        println(i)
      }
    }
    test1(10)(20)

  }

}
