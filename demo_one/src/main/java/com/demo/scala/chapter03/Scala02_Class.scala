package com.demo.scala.chapter03

import scala.beans.BeanProperty


class Scala02_Class {

}
object Scala02_Class {

  /**
    * scala与Java的class 语法大同小异
    *   1.scala中所有声明的类都可以是公共的
    *   2.使用object也可以声明类，当同时也会声明另外一个对象的类
    *     主要是为了模拟静态语法
    *     todo 对象名称（类名）.方法
    *    使用object关键字可以编译成2个文件，这两个文件之间有关系
    *      一般情况下，将java中的成员方法和属性声明在object声明类中
    *      将java中的静态方法和属性声明在object声明另外一个类（$）中
    *     todo 将object声明的类称之为伴生类，将object声明的对象称之伴生对象
    *   3.
    *
    *
    */

  def main(args: Array[String]): Unit = {

    val user = new User()
    user.name = "李四"
//    user.setName()
//    user.getName()

  }

  /**
    * 1.scala中给类声明属性等同于给类声明变量
    * 类中的变量称之为属性
    * 2.变量使用var，val声明
    * 3.变量类型可以推断出来，那么可以省略
    * 4.变量必须显示的初始化
    *   但是也希望可以java保持一致，可以采用下划线进行赋值，表示由系统进行赋值
    *    如果通过下划线赋值，那么属性的类型不能省略
    *    val不能使用下划线赋值
    *  5.类的属性编译后，都是private权限，且生成公共的set get方法，但是名字中不是set get开头
    *   当访问属性，等同调用对象属性的get方法；当给属性赋值，等同于调用set方法
    *   scala中对象属性不遵循bean规范，和其他框架集成，会出现很多问题，所以为了能够和其他框架集成，提供了注解，解决bean规范问题
   *
    */
  class User{
    @BeanProperty var name:String = "zhangsan"
    val age:Int = 18
    val add = "北京"
    var email:String = _

  }

}
