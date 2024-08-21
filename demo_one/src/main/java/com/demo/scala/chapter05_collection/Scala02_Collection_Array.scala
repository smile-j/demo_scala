package com.demo.scala.chapter05_collection

object Scala02_Collection_Array {

  def main(args: Array[String]): Unit = {

    //集合 - 数组
    /**
      * scala 是一个完全面向对象的语言，所以万物皆对象
      * 数组也是对象，也有自己的类型：Array. 本质就是java的数组[]
      *
      * scala中的中括号表示泛型
      */

    //创建：增删改查
    val arrayStr = new Array[String](3)
    //array没有添加、删除的能力，只能通过索引修改数据
    //array访问索引操作采用小括号，而不是中括号
    arrayStr(0) ="zhangsan"
    arrayStr(1) ="lisi"
    arrayStr(2) ="wangwu"

    println(arrayStr(0))
    println(arrayStr.mkString(","))
    //for循环
//    for(item<- arrayStr){
//      println(item)
//    }
    //采用面向对象的方式实现循环操作:foreach
    //foreach 方法的作用就是将集合中的每一条数据进行处理
    //这里的处理逻辑不是固定的。由开发人员自行决定，scala集合帮开发人员将数据传递到逻辑
    //foreach 方法的参数有一个，这个参数的类型是函数类型：string=>unit
   def forFun(str:String)={
      println("****** "+str)
    }
//    arrayStr.foreach(forFun)
//    arrayStr.foreach((str:String)=>{
//      println("****** "+str)
//    })

//    arrayStr.foreach(println(_))
//    println(arrayStr)
//
//    //构建数组，同时增加数据
//    var array:Array[Int] = Array.apply(1,2,3,4)
//    var array1:Array[Int] = Array(1,2,3,4)
//    println(array.mkString(","))
//    println(array1.mkString(","))

    //todo  array 其实就是不可变数组
    val array:Array[Int] = Array.apply(1,2,3,4)

//    //添加数据,会产生新的数组
//    val array1 = array.+:(5)
//    val array2 = array.:+(6)
//    array.++:()
//    println(array eq array1)
//    println(array eq array2)

//    println(array.mkString(","))
//    println(array1.mkString(","))
//    println(array2.mkString(","))

    //一般情况下，调用集合对象的特殊符合的方法时，都会采用运算符的方式使用
    //如果运算符采用冒号结尾，那么运算规则为从右边向左边计算
    var array1 = 5 +: array
    val array2 = array :+ 6
    println(array1.mkString(","))
    println(array2.mkString(","))
    var array3 = array1 ++: array2
    println(array3.mkString(","))

  }

}
