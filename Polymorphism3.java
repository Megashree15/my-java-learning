import java.util.*;//method overloading
class Details{
    void Student(){
        System.out.println("Student details");
    }
    String Student(String name){//here String is return type of method
        return name;
    }
    int Student(int id){
        return id;
    }
}
public class Polymorphism3{
    public static void main(String args[]){
        Details d =new Details();//obj creation
        d.Student();//calls void method
       System.out.println( d.Student("Mega"));//variable declaraion through obj
        System.out.println(d.Student(40));//use sop for printing the returning values
    }
}
//method overloading / compile time polymorphism / early binding or static binding polymorphism
//multiple methods - same method name-same class- diff parameter list  