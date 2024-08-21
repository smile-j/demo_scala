package com.demo.scala.chapter09;

import com.demo.scala.test.Person;
import com.demo.scala.test.Student;

import java.util.LinkedList;
import java.util.List;

public class Scala01_Generic {

    /**
     * Java 泛型
     *
     */

    public static void main(String[] args) {

        //1.泛型用于进行内部数据类型约束，在编译时有效，运行时无效

        //2.泛型的应用时机，定义泛型后，什么时候起作用
        //  泛型定义后，才会起作用，不会对之前的代码起作用
        //  泛型在约束类型，意味着使用到了泛型才会出现错误，否则不会出现错误
        List list = new LinkedList();
        list.add(new Person());

        List<Student> listStudents = list;
//        for (Student student : listStudents) {
//            System.out.println(student);
//        }

        //3.泛型和多态无关
        List<String> listStr = new LinkedList<String>();
        listStr.add("aa");
//        test(listStr);
        //4.泛型不可变(父子类严格区分)
//        Message<AA> message1 = new Message<AA>();
//        Message<AA> message2 = new Message<A>();
//        Message<AA> message3 = new Message<AAA>();

        //5.如果泛型变化比较小，那么应用面比较窄，所以泛型可以扩大范围
        //      使用过程中，泛型存在上、下线的概念

        //上线一般应用于消费者对象
        Producer<AA> producer = new Producer<AA>();
        producer.producer(new Message<AA>());
        producer.producer(new Message<A>());
//        producer.producer(new Message<AAA>());

        //下线一般应用于生产者对象
        Consumer<AA> consumer = new Consumer<AA>();
        Message<? extends AA> consume = consumer.consumer();
        AA content1 = consume.content;
//        AAA content2 = consume.content;
//        A content3 = consume.content;


    }

    public static void test(List<Object> list){
        System.out.println(list);
    }


    static class Consumer<T>{

        //上线，类型往下找
        public Message<? extends T> consumer(){
            return null;
        }
    }

    static class Producer<T>{
        //下线，类型往上找
        public void producer(Message<? super T> message){

        }
    }

    static class A{

    }
    static class AA extends A{

    }
    static class AAA extends AA{

    }

}
