import java.util.*;
abstract class Dosa{//abstract class base class
    void make(){//concrete or normal method
        System.out.println("MAKING DOSA");
    }
    abstract void receipe();//abstract method
    abstract void output();//abstract method
}
class Chef extends Dosa{//child class inherits abstract base class to explain
    @Override
     void receipe(){//abstract methods overriden 
System.out.println("RICE+ + UDHUR DAL = DOSA BATTER");
    }
    @Override 
    void output(){//abstract method overriden
        System.out.println("CRISPY DOSA READY");
    }
}
public class Abstraction{//main class
    public static void main(String args[]){
Dosa d =new Chef();//upcasting obj creation for derived class
d.make();//calls base class method
d.receipe();//calls overriden method
d.output();

    }
}
