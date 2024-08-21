package com.demo.scala.chapter08

object Scala03_Transform {

  /**
    * 隐式转换
    *
    */

  def main(args: Array[String]): Unit = {

    /**
      * 注册用户
      * 开发的时候明确知道，数据可能会发生改变，所以可以在数字上增加关键字 implicit
      * 在函数参数前增加implicit,表示隐式参数，正常调用情况下，不会起作用
      * 如果想要让隐式参数起作用，那么意味着不能正常传递，需要设定隐式变量
      */
    def reg(implicit pwd:String ="000000")={
      println(s"name:无,pwd  :${pwd}")
    }

//    reg("123")
//    reg()
    implicit val pwd="123123"

    reg

  }

}
