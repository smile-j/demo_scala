package com.demo.scala.chapter02_function

object Scala01_Function {

  def main(args: Array[String]): Unit = {
    /**
      * 1.函数只在当前作用域有效
      * 函数的声明和使用
      *  声明： def 函数名（参数列表）：返回值类型 = { 函数体 }
      *  使用：函数名（参数）
      */
    def testHello():Unit={
      println("hello。。。function")
    }

    /**
      * 1.函数 & 方法
      * 1.函数可以声明在任意位置，方法只能声明在类中
      *   如果函数和方法名字一样，默认调用函数；如果没有函数，则调用方法
      *    方法和对象相关，而函数是独立使用的
      */

    /**
      * 2.函数的本质：
      *   就是java的方法；没有方法重载重写
      *   函数编译成方法时，增加了修饰符 private static final
      *   函数编译成方法时，函数名会自动发生变化，为了避免和方法名冲突
      */
    testHello()
    this.testHello

  }

  def testHello():Unit={
    println("hello。。。method")
  }
}
