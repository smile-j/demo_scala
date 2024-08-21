package com.demo.scala.chapter03

object Scala09_Object_Ext {

  /**
    * 面向对象编程-比较对象
    * 1.scala中双等号比较其实就是非空equlas 判断。但是这里的equlas判断默认就是比较内存
    *    但是一般情况下，比较对象都重写equlas方法
    */

  def main(args: Array[String]): Unit = {
    val user1 = new User()
    user1.id=1001
    val user2 = new User()
    user2.id=1001
    println(user1==user2)
    //------------------
    //获取对象的类型信息
    //java: String.class ->类型信息-》class->方法区
    //scala:classof[String]->类型信息-》方法区
//    val value:Class[User] = classOf[User]
//    value.getInterfaces
//    value.getFields


    //String类型表示不可变字符串
    val name:String ="a b"
    val stringClass :Class[String] = classOf[String]
    val filed = stringClass.getDeclaredField("value")
    filed.setAccessible(true)
    val value = filed.get(name).asInstanceOf[Array[Char]]
    value.update(1,'c')

    println("!"+name+"!")



  }

  class User{

    var id:Int =_

    override def equals(obj: Any): Boolean = {

      if(obj.isInstanceOf[User]){
        val otherUser = obj.asInstanceOf[User]
        this.id == otherUser.id
      }else{
        false
      }

    }

  }

}
