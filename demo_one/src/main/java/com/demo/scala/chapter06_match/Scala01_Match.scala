package com.demo.scala.chapter06_match

object Scala01_Match {

  /**
    * 模式匹配即匹配数据规则
    * 如果多个匹配规则匹配不成功，可以使用下划线表示任意值，类似default，
    * 必须有默认规则，否则抛出异常（MatchError）
    * 如果代码只有一行，可以省略大括号
    *
    */

  def main(args: Array[String]): Unit = {

    val age =30

    age match {
      case 10 => {
        println("年龄：10")
      }
      case 20 => {
        println("年龄：20")
      }
      case _ => {
        println("年龄：未知")
      }
    }
    println("。。。。。end")


  }

}
