import java.util.*;
public class Armstrong{
    public static void main(String args[]){
        //153=sum of cube of each digit is equal to the same number
        Scanner S=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=S.nextInt();
        int temp=num;
        int sum=0;
        while(temp>0){
            int remainder=temp%10;
            sum=sum+remainder*remainder*remainder;
            temp/=10;
        }
        if(sum==num){
System.out.println("Armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
