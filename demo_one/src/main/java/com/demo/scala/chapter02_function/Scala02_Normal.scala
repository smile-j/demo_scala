package com.demo.scala.chapter02_function

object Scala02_Normal {


  def main(args: Array[String]): Unit = {

    /**
      * 马丁 设计scala:至简原则，能省则省
      */
    //1.返回值，return可以省略，返回最后一行的结果
    def fun1():String={
//      return "张三"
      "zhangsan"
    }
    //2.如果函数只有一行，那么可以将大括号省略
    def fun2():String="zhangsan"
    //3.如果能通过返回值，推动出返回类型，返回类型也能省略
    def fun3() = "张三"
    //4.如果没有参数，小括号也可以省略;如果省略小括号，调用时也不能添加
    def fun4 ="zhangsan"
//    println(fun4)
    //声明函数没有小括号，调用也不能加
//    println(fun4())

    //5.等号可以省略，但是一般是和Unit同时省略
    //如果逻辑代码中有return返回，但是函数声明为Unit,return不起作用
   //返回值类型为Unit,但是想省略， 那么Unit和等号一起省略
    def fun5(){
       "zhangsan"
    }
//    println(fun5())
    //6. 如果函数名称不重要的时候，def和函数名也可以省略，称之为匿名函数
    /**
      * 1.def和函数名省略
      * 2.返回值类型也需要省略，由逻辑代码代码自动推断
      * 3.等号需要增加一个大于号表示关联
      */

    ()=>{
      return "lisi"
    }

  }

}
