package com.demo.scala

import com.demo.scala.chapter08.Scala05_Transform.User

package object chapter07 {
  implicit class UserExt(user:User){
        def updateUser(): Unit ={
          println("update........")
        }
      }
}
