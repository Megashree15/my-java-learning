import java.util.*;
public class Constructor{//default constructor
    int age;
    public static void main(String args[]){
        Constructor c= new Constructor();//object creation
        System.out.println(""+c.age);//here no constructor is created so when obj is
        //  created a default constructor is created and gives default value
    }

}
