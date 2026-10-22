import java.util.*;
    class Shapes{
        void Shape()
        {
            System.out.println("there are so many shapes");
        }
    }
    class Shapes1 extends Shapes{
        @Override
        void Shape(){

            System.out.println("Square and recatngle has 4 sides");
        }
    }
public class Polymorphism4{
    public static void main(String args[]){
        Shapes S =new Shapes();
        S.Shape();
        Shapes s = new Shapes1();
        s.Shape();


    }
}