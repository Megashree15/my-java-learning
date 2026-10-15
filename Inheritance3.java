import java.util.*;//hierarchial inheritance
class Shape{//base class
    void print(){//base method
        System.out.println("Finding area of shapes!!!!!");
    }
int side= 3;// base class dm
        int length= 5;
        int breadth =8;
        int area;
        int area1;
}
class Square extends Shape{//child class1 inherits from base class
Square(){//constructor
    area =side *side;//dm inherited from base class
}
void display1(){//cc1 method
    System.out.println("Area of Square is "+area);
}
}
class Rectangle extends Shape{//child class 2 inherits from base class
    Rectangle(){//constructor
        area1=length*breadth;//dm inherited from base class
    }
    void display2(){//cc2 method
        System.out.println("Area of rectangle is "+area1);
    }
}
public class Inheritance3{//main class
    public static void main(String args[]){
        Rectangle r =new Rectangle();
        Square s = new Square();//creaing obj for last both child classes to access metjods, automatically calls constructor from top 
        r.print();
        r.display2();
        s.display1();

    }
}