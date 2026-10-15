import java.util.*;
public class Strings1{
    public static void main(String args[]){
String str1= "Hi Mega";//or String str1 =new String("Hi Mega");//
//to get length
System.out.println(str1.length());
System.out.println(str1.toString());//to print String//
String str2=new String("Shree");
String str3=str1 +str2;//concatenation adds to end//
System.out.println(str3.toString());
System.out.println(str1.charAt(3));//accessing using index//
System.out.println(str1.equals(str2));//checks equality


    }

}