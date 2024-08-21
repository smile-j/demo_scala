package com.demo.scala.chapter07

object Scala01_Exception {

  /**
    * 异常
    * java中异常Excetpion ,错误Error
    * java中的异常分2大类：编译异常 & 运行期异常
    * 所有的异常其实都是由对象，所有的对象都是在运行时构建出的
    * 编译异常其实就是根据异常的解决难易程度，提示给开发人员，也称之为提示异常
    * 如果提示了异常，但是没有处理（try catch）,需要将异常抛出去
    *
    * scala的异常和java很相似，但是有区别
    * scala中的异常没有分类，所以也没有throws关键字
    * scala的异常处理类似于模式处理
    * 捕获异常时，无需考虑异常范围，但是如果异常方法大先捕获，其他的异常就捕获不到，没有意义
    *
    */

  def main(args: Array[String]): Unit = {

      try {
        val i =0;
        var j = 10/i
      }catch {
        case e:ArithmeticException =>{
          println("ArithmeticException exception:"+e)
        }

        case e:Exception =>{
          println("exception:"+e)
        }

      }finally {
        println("finally.......")
      }

  }

  @throws[Exception]
  def test()={
    throw new Exception()
  }
}
