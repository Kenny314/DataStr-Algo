package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test implements Cloneable{
    public static int test(int a,int b){
        return a+b;
    }

    public static String test(String a ,String b){
        return a+b;
    }

    public Test(){
        System.out.println("father");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(Test.test(3,5));
        System.out.println(Test.test("aaa","bbb"));
//        Person p1 = new Person(1,"ttt");
//        Person p2 = new Person(1,"ttt");
//
//
//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());
//        System.out.println(p1.equals(p2));
//
//        Set<Person> s = new HashSet<Person>();
//        s.add(p1);
//        s.add(p2);

//        for (Person p: s) {
//            System.out.println(p.getId()+"---"+p.getName());
//        }
    }
}
