import java.util.*;
//method overloading//
class Calculator{
    long sum;
   int diff;
    int pro;
    float rem;
    double quo;

void calculate(){
    System.out.println("this ia a calculator");
}
long calculate(long a, long b){

sum=a +b;
return sum;
}
int calculate(short c,short d){

diff=c-d;
return diff;
}
int calculate(byte e,byte f){
    
    pro=e * f;
    return pro;
}
float calculate(float g,float h){
   
    rem=g%h;
    return rem;
}
double calculate(double i,double j){
    
    quo=i/j;
    return quo;
}
}
public class Polymorphism1{
    public static void main(String args[]){
Calculator C= new Calculator();
C.calculate();
System.out.println(C.calculate(20L,30L));
System.out.println(C.calculate((short) 50,(short)30));
System.out.println(C.calculate((byte)4,(byte)5));
System.out.println(C.calculate(45.00f,2.00f));
System.out.println(C.calculate(50.000,5.00));

    }
}