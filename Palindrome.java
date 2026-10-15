import java.util.*;
public class Palindrome{
    public static void main(String args[]){
       //palindrome - 121,343,madam,eye,6473746 
       Scanner S=new Scanner(System.in);
       System.out.println("enter a number");
       int original=S.nextInt();
       int reverse=0;
       int temp =original;
       while(temp>0){
        int remainder=temp%10;
        reverse=reverse*10+remainder;
        temp/=10;
    
       }
       if(reverse==original){
        System.out.println("palindrome "+original);
       }
       else{
        System.out.println("not palindrome"+original);
       }
    }
}