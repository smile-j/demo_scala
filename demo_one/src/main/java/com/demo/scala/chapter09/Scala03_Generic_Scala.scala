package com.demo.scala.chapter09

object Scala03_Generic_Scala {

  /**
    * 泛型
    * scala中的泛型也存在上限和下限的概念，但是不是采用关键之，而是采用颜文字
    *
    */
  def main(args: Array[String]): Unit = {



  }

  class Message[T]{

    var context:T = _

  }

  /**
    * 生产者的目的是为了生成对象，所以需要保证对象具有通用性，所以需要将类型向上查找
    * 即下限
    */
    class Producer[T]{
      def produce(message: Message[_ >: T])={

      }
  }
  /**
    * 消费者的目的是消费数据，所以需要保证获取到的数据，功能不能丢失，需要向下查找
    * 上限
    */
  class Consumer[T]{
    def consume():Message[_ <: T]={
      null
    }
  }
  class B{

  }
  class BB extends B{

  }
  class BBB extends BB{

  }
}
