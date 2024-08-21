package com.demo.scala.chapter01

object Scala09_Partial {

  /**
    * 偏函数 PartialFunction
    *  偏函数是一个接受较少参数的函数，并且返回一个新的函数，这个新的函数接受更多的参数
    *
    */


  def main(args: Array[String]): Unit = {

    //1.
    // 定义一个接受一个参数的偏函数
    val multiplyByTwo: PartialFunction[Int, Int] = {
      case x => x * 2
    }

    // 使用偏函数
    val result = multiplyByTwo(3) // 结果为 6
    println(result)

    //2.
    // 定义一个接受一个参数的偏函数，用于处理Option类型
    val printIfDefined: PartialFunction[Option[String], Unit] = {
      case Some(x) => println(x)
      case _ =>
    }

    // 使用偏函数
    val someValue: Option[String] = Some("Hello, World!")
    val noneValue: Option[String] = None

    printIfDefined(someValue) // 输出 "Hello, World!"
    printIfDefined(noneValue) // 不做任何操作

    //3 将下面list 数字乘以2 返回
    val list = List(1, 2, 3, 4, "abc")
    //3.1 过滤
    val newList = list.filter(e=>e.isInstanceOf[Int]).map(e=>e.asInstanceOf[Int]).map(_* 2)
//    println(newList)
    //3.2 模式匹配
    val newList2 = list.map(e => {
     e match {
       case x: Int => x * 2
       case _ =>
     }
    })
//    println(newList2)
    //3.2 偏函数
    val list3 = list.collect(new PartialFunction[Any, Int] {
      override def isDefinedAt(x: Any): Boolean = if (x.isInstanceOf[Int]) true else false

      override def apply(v1: Any): Int = v1.asInstanceOf[Int] * 2
    })
    println(list3)

  }

}
