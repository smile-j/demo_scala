package com.demo.scala.chapter09

object Scala02_Generic_Scala {

  /**
    * 泛型
    * scala中的泛型与java的泛型大同小异
    * 1.java的泛型使用的是<>,scala采用的是中括号
    * 2.scala的泛型也是不可变
    * 3.泛型没有多态
    *     为了开发方便，整合概念，scala进行了语法补充
    *     泛型+多态
    *     3.1 如果类型不变，但是泛型存在多态（父子关系），那么类型+泛型也存在多态（父子关系）
    *         如果实现这样的功能，那么泛型就发生了变化，称之为【协变】
    *         协变的基本语法：就是在泛型的前面增加特殊符合：+
    *     3.2如果类型不变，但是泛型存在多态（父子关系），那么类型+泛型也存在多态（子父关系）
    *         如果实现这样的功能，那么泛型就发生了变化，称之为【逆变】
    *         逆变的基本语法：就是在泛型的前面增加特殊符合：-
    *
    * 4.
    * 5.
    * 6.
    */
  def main(args: Array[String]): Unit = {

    val message1:Message[BB] = new Message[BB]
    val message2:Message[BB] = new Message[B]
//    val message3:Message[BB] = new Message[BBB]

  }

  class Message[-T]{

  }
  class B{

  }
  class BB extends B{

  }
  class BBB extends BB{

  }
}
