import java.util.*;//multilevel inheritance
class Animal{
     void print(){
    System.out.println("It is an animal");
    }
}
class Dog extends Animal{
String d=  "Dog";
Dog(){
    System.out.println("It is a "+d);
    super.print();
}

}
class Puppy extends Dog{
    String p=  "Puppy";
    Puppy(){
        System.out.println("it is a "+p);
    System.out.println("it is a baby "+d);
    super.print();
    }
}
public class Inheritance2{
    public static void main(String args[]){
        Puppy P = new Puppy();


    }
}