package com.demo.scala.chapter03

object Scala05_Object_Instants_Mehtod_ {

  def main(args: Array[String]): Unit = {

    //java的构造方法可以重载
    //scala方法如何重载？
    //scala的构造方法分为2大类：
    //1.主构造方法：完成类的初始化
    //2.辅助构造方法：在类的初始化后，完成类的辅助功能，属性赋值等
    //                辅助构造方法必须直接或者间接的调用主构造方法
    //                辅助构造方法有重载的概念，但是主构造方法没有
    //                辅助构造方法 它采用this关键字声明
    //                多个辅助构造方法调用时，需要提起声明

    val person = new Person()
    println("-"*10)
    val person2 = new Person("zhangsan")
    val user = new User()
//    println(user)
//    val user2 = new User("lisi")
//    println(user2)
    user
  }


  class Person(){

    println("....instants....start")

    def this(name:String){
      this()
      println("this...."+name)
    }
    def this(name:String,age:Int){
      this(name)
      println(s"this....name:${name},age:${age}")
    }
    println("....instants....end")


  }

  //scala为了开发方便，可以在构造参数前增加var val,让参数作为类的属性存在
  class User(var name:String="无名") {
    //类的主体 & 构造函数体
    println("user......"+name)

  }
}
