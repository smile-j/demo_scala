package com.demo.scala.chapter01

import scala.util.control.Breaks
import scala.util.control.Breaks._

object Scala06_break {

  /**
    * java break 中断，跳出；continue 跳出本次循环
    * scala 没有 break、continue
    *   break 采用面向对象的方式来代替，底层采用抛出异常跳出for循环。外层应捕获异常
    *   scala 可以通过特殊的语法操作，让代码变得简单些
    *
    */

  def main(args: Array[String]): Unit = {

//    Breaks.breakable{
//      for (i <- 1 to 5){
//        println(i)
//        if (i == 3){
//          Breaks.break();
//        }
//      }
//    }

    //scala可以通过特殊的语法操作，让代码变得简单些
    breakable{
      for (i <- 1 to 5){
        println(i)
        if (i == 3){
          break
        }
      }
    }

    println("...end main")

  }

}
