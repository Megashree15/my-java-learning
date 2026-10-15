import java.util.*;
public class Fibonacci{
    public static void main(String args[]){
//0 1 1 2 3 5.....
Scanner S =new Scanner(System.in);
System.out.println("enter n:");
int n =S.nextInt();
int a= 0;
int b= 1;
int c= 0;
for(int i=1;i<=n;i++){
    c=a+ b;
    a=b;
    b=c;

}
System.out.println(c);

    }
}
