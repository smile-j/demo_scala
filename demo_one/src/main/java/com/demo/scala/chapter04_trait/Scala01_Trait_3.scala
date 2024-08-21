package com.demo.scala.chapter04_trait

import com.demo.scala.chapter04_trait.Scala01_Trait_3.Operate

object Scala01_Trait_3 {

  /**
    * scala 特质的执行顺
    *
    *
    */

  def main(args: Array[String]): Unit = {

    //类混入特质时，也存在钻石问题，但是scala采用了一种特殊的方式
    //1.为什么混入特质
    //  增加约束；功能的补充和叠加
    //2.如果混入多个相同的功能，那么需要一个执行顺序，否则会执行出现错误
    //
    //
    /**
      * scala如何解决钻石问题：
      *   将多个功能混入一起，按照特定的执行顺序进行叠加调用
      *   这里的特定的执行顺序就是初始化顺序的一个反向操作
      */


    val mysql = new MySql()
    mysql.operateData()

  }

  trait Operate {
    println("...init operate")

    def operateData()={
      println("操作数据")
    }
  }
  trait DataBase extends Operate {

    override def operateData(): Unit = {

      println("database 操作数据")
      //这里的supper 不是表示父特质，而是表示功能叠加的上一级
      super[Operate].operateData()

    }

  }

  trait Log extends Operate {

    override def operateData(): Unit = {

      println("日志文件 操作数据")
      super.operateData()

    }

  }

  class MySql extends Log with DataBase {
    println("...init mysql")

  }

}
