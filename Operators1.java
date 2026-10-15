//Arithmetic operators//
import java.util.*;
public class Operators1{
    public static void main(String args[]){
        int a= 50;
        int b= 20;
        System.out.println(a+b);//sum
        System.out.println(a-b);//difference
        System.out.println(a*b);//produvt
        System.out.println(a%b);//modulus - remainder
        System.out.println(a/b);//quotient
        //logical operators//
        boolean c= true;
        boolean d= false;
        System.out.println(c &&d);//and
        System.out.println(c||d);//or
        System.out.println(!c);//not
        System.out.println(!d);//not
        //unary operator//
        System.out.println(a++);//post increment -gives the same value and then increments
        System.out.println(++a);//pre increment- increments and then returns a value
        System.out.println(b--);//post decrement- returns value and then decrements
        System.out.println(--b);//pre decrement- decrements and then returns
        //two ++ increses two times + increse one time
        //Assignment operator//
        int e= 30;
        System.out.println(e);//assign 
        System.out.println(e+=5);//add and assign
        System.out.println(e-=5);//subtract and assign
        System.out.println(e*=5);//multiply and assign
        System.out.println(e/=5);//divide and assign quotient
        System.out.println(e%=5);//modulos and assign remainder
        //relational operators//
        int a1=49;
        int b1=100;
        int c1=-89;
        int d1=49;
        System.out.println(a1==d1);//checks equality
        System.out.println(b1>a1);//greater than
        System.out.println(c1<a1);//less than
        System.out.println(a1!=c1);//not equal
        System.out.println(b1>=a1);//greater than or equal to
        System.out.println(d1<=b1);//less than or eaual to



    }
}