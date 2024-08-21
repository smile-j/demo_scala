package com.demo.scala.chapter02_function

object Scala10_Function {


  def main(args: Array[String]): Unit = {

   //递归 ：自己调用自己

    //阶乘
    //scala中的泛型的返回值类型不能省略
    def test(num:Int):Int ={
      if(num<=1){
        1
      }else{
        num * test(num-1)
      }
    }
    println(test(5))

    //如果压栈的次数超过阈值，就会出现错误，即使有跳出也会报错
    //scala采用了一种特殊的语法优化递归操作：伪递归
    //scala采用while循环来实现伪递归
    def test2():Unit={

      println ("test2")
      test2()

    }

  }

}
