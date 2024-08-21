package com.demo.scala.chapter03




object Scala01_Object_Import {


  def main(args: Array[String]): Unit = {

    /**
      * 导入 import
      * 1.import 是可以导包
      */
    import com.demo.scala.chapter02_function
    testPackageObject()

    //2.import可以在任意地方使用
    //import如果在当前位置使用，那么其他位置就不能使用
//    import java.util.Date
//    val date = new Date()

    //3.scala导入一个包中所有的类，采用下划线代替java中的*
//    import java.util._
//    new util.ArrayList()

    //4.可以将一个包的多个类在同一行导入
//    import java.util.{LinkedHashMap,ArrayList,Map}

    //5.屏蔽类
    //如果不同的包中有相同的类，可以通过屏蔽方式进行编译
//    import java.util._
//    import java.sql.{Date=> _ , _}
//    new Date()

    //6.给类起别名
    import java.util.{HashMap=>JavaHashMap}
    val map = new JavaHashMap()
    println(map)

    //7.scala中import规则
    //以当前包为基准，导入指定子包中的类，如果找不到，再从顶级包中依次查找
    println(new _root_.java.util.HashMap())

    //8.有些内容无需导入
    //Java 中java.lang包中类无需要导入
    //scala中 java.lang包中的类也无需导入
    //scala中 scala包也无需导入
    //scala中 Predef对象的方法也无需导入，类似静态导入
    new Object()
    new String()
    println()

  }
}

package java{
  package util{
    class HashMap{

  }
  }
}


