import java.util.*;
public class Constructor1{
    String name;
    int age;
Constructor1(){//non parameterized constructor
    System.out.println("name and age");
}
Constructor1(String n ,int a ){//parameterized constructor
    name=n;
    age=a;
}
public static void main(String args[]){
    Constructor1 c1 =new Constructor1();//obj for non parameter constructor
Constructor1 c2= new Constructor1("mega",22);//obj for parameter constructor
System.out.println(c2.name);
System.out.println(c2.age);
}
}