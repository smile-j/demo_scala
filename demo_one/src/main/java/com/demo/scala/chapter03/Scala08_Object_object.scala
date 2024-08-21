package com.demo.scala.chapter03

object Scala08_Object_object {

  /**
    *  关键字object 声明的是类，同时是伴生对象
    *  apply方法可用于构建对象，但是不仅仅用于构建对象
    *  apply方法可以被编译器动态识别，所以可以省略
    */

  def main(args: Array[String]): Unit = {
    //此处代码执行的是类的构造方法，完成对象的初始化操作
    val user1 = new User()
    println("*"*10)
    //如果直接访问类名，其实访问不是类，而是伴生对象
    val user2 = User
    println("*"*10)
    //apply 主要用于构建对象
    val user3 = User.apply()
    println("*"*10)
    //apply 方法由于场景比较多，所以编译器可以动态识别，所以调用时可以省略
    val user4 = User()
  }

  class User{
      println("user。。。。。")
  }
  object User{
    def apply(): User = {
      println("...apply user")
      new User()
    }
  }

}
