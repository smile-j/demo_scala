package com.demo.scala.chapter03

object Scala01_Object_Import_Object {


  def main(args: Array[String]): Unit = {

    //引入对象
    //println 方法从来没有声明过，但是可以使用
    //scala默认导入了Predef 对象，类似于静态导入
    //但是scala中使用object 声明的对象其实模拟静态语法，但是本质上就是一个对象
    //所以这里其实就是导入对象
//    println("hello")

    //导入对象的所有内容
    //这里的导入要求对象必须使用val声明
    val user = new User()
    import user._
//    user.test()
    test()



  }

  class  User{
    def test()={
      println("user...test...")
    }
  }
}



