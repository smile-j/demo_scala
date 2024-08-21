package com.demo.scala.chapter06_match


object Scala05_Match_1 {

  def main(args: Array[String]): Unit = {

    /**
      * 模式匹配 -- 对象
      * 对象匹配比较麻烦，需要增加一些特定的方法
      * scala语言提供了一种简单方式的实现
      *   class 前面增加关键字case
      *   并且需要传递参数，用于匹配属性，这样的类称之为【样例类】
      *
      */

      //1.样例类的构造参数会自动作为类的属性，默认不能改变，使用val声明，
      // 需要改，需要使用var
      //2.样例类就是一个普通类，只不过可以应用在模式匹配中用于匹配对象
      //3.样例类自动实现可序列化接口，重写方法 eq copy hashcode
      //4.样例类同时声明了伴生对象，存在apply,unapply
    val user = thirdPart()

    user match {
      case User("zhangsan",23)=>{
        println("zhangsan用户")
      }
      case _ =>{
        println("不是zhangsan")
      }
    }

  }

  case class User(name: String, age:Int){

  }
  def thirdPart()={
    User("zhangsan",23)
  }


}
