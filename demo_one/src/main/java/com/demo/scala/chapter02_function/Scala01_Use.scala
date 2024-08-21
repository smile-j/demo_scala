package com.demo.scala.chapter02_function

object Scala01_Use {


  def main(args: Array[String]): Unit = {

    def handlerUpper(s:String):String ={
      return s.substring(0,1).toUpperCase+s.substring(1)
    }

    val name = handlerUpper("zhangsan")
    println(name)

    //1.无参，无返回值
    def fun1():Unit={
      println("fun1")
    }
    fun1()
    fun1
    //2.无参数，有返回值
    def fun2():String={
      return "张三"
    }
    val result2 = fun2()
    //3.有参，无返回值
    def fun3(param:String):Unit={
      println("参数："+param)
    }
    fun3("张三")
    //函数只有一个参数，不能省略小括号，方法可以省略
//    fun3 "123"
    //4.有参数，有返回值
    def fun4(param:String): Unit={
      return param.length
    }
    //5.多参数，无返回值
    def fun5(name:String,age:Int):Unit={
      println(
        s"""
          |"name":${name},"age":${age}
        """.stripMargin)
    }
//    fun5("张三",18)
    //6.多参数，有返回值
    def fun6(name:String,age:Int):String={
//      return s"name:${name},age:${age}"
      return (
        s"""
           |"name":${name},"age":${age}
        """.stripMargin)
    }
    val aa = fun6("aa",11)
//    println(aa)
    //7.可变参数,且多个参数时，可变参数必须放在最后
    def fun7(params:String*):Unit={
      println(params)
    }
    fun7()
    fun7("张三")
    fun7("张三","李四")
    def fun7_8(name:String,params:String*):Unit={
      println(params)
    }
    //8.声明时，给默认值
    def reg(name:String,password:String ="000000"):Unit={
        println(s"name:${name},password:${password}")
    }
    reg("张三")
    //对指定参数传值
    reg(name="wangwu")
    reg("李四","123456")

  }

}
