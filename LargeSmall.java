import java.util.*;
public class LargeSmall{
    public static void main(String args[]){
        int a =100;
        int b =50;
        int c =-1000; 
        //largest
        if(a>b&&a>c){
                 System.out.println("greatest is a");
            }
           
        else if( b>c){
            System.out.println("greatest is b");

        }
        else{
            System.out.println("grestest is c");
        }
        //smallest
        if(a<b && a<c){
            System.out.println("Smallest is a");
        }
else if (b<c){
    System.out.println("smallest is b");
}
else{
    System.out.println("smallest is c");
}
       }
}