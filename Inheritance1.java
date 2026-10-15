import java.util.*;//single inheritance
 class A{//parent class or base class or super class
    String name= "mega";//parent dm
    void print(){//parent method
        System.out.println("Hi");
    }
}
     class B extends A{//derived class or child class or sub class
        int age= 22;//derived class dm
         B(){//constructor
            System.out.println(super.name);//inherits parent dm here super is used to access parent dm
            System.out.println(age);
        }
    }
    public class Inheritance1{//public class name must be the file name
        public static void main(String args[]){
            B b= new B();//object for derived class automatically calls constructor in B
            b.print();//using derived class obj to access super class method

        }
    }
