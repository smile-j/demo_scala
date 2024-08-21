package com.demo.scala.chapter02_function

import scala.util.control.Breaks

object Scala07_Abstract {

  /**
    * 控制抽象
    *
    */

  def main(args: Array[String]): Unit = {


    def test1(f:()=>Unit)={
      f()
    }

    /**
      * 函数类型只有返回，没有输入的场合，称之为抽象，因为不完整
      * 调用的时候，不能使用小括号
      * 传值的时候进行控制
      *
      */
    def test2(f: =>Unit)={
      f
    }

//    test1(()=>{
//      println("hello")
//    })


    /**
      * 完整的参数传递，是将函数对象作为参数进行传递
      * 所谓的控制抽象，其实就是将代码作为参数传递
      *
      * 自定义语法时，可采用控制抽象，因为代码是可以传递，也意味着逻辑是变化的
      *
      *
      */
    test2(
      println("hello2")
    )
    test2({
      val str = "zhangsan"*3
      println(str)
    })
    //循环中断的代码就体型了控制抽象
    //如果参数跨域多行，那么可以将小括号改成大括号
    Breaks.breakable{
      for (i <- 1 to 5){
        if(i==3){
          Breaks.break()

        }
        println("i="+i)
      }
    }



  }


}
