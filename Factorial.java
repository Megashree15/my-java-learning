import java.util.*;
    public class Factorial{
public static void main(String args[]){
    //2! =2*1
    int fact=1;
Scanner S=new Scanner(System.in);
System.out.println("enter n:");
int n=S.nextInt();
for(int i=1;i<=n;i++){
 fact=fact*i;
}
System.out.println(fact);
}
    }