import java.util.*;
public class AllDatatypes{
    public static void main(String args[]){
       Scanner S=new Scanner(System.in);
        System.out.println("St");//String should always be given at beginning or use S.nextLine() before;
       String St= S.nextLine();
       System.out.println("i");
       int i =S.nextInt();
       System.out.println("b");
       byte b= S.nextByte();
       System.out.println("s");
       short s= S.nextShort();
       System.out.println("l");
       long l =S.nextLong();
       System.out.println("f");
       float f =S.nextFloat();
       System.out.println("d");
       double d= S.nextDouble();
       System.out.println("c");
       char c= S.next().charAt(0);
       System.out.println("boo");
       boolean boo= S.nextBoolean();
       int[] arr=new int[5];//array
       System.out.println("Enter 5 num:");
       for(int j=0;j<5;j++){
            arr[j]=S.nextInt();
           }
       System.out.println(i);
        System.out.println(b);
         System.out.println(s);
          System.out.println(l);
           System.out.println(boo);
           System.out.println(c);
           System.out.println(f);
           System.out.println(d);
           System.out.println(St);
           System.out.println(Arrays.toString(arr));
    }
}
        
