import java.util.*;
public class Strings2{
    public static void main(String args[]){

        StringBuilder sb=new StringBuilder("Welcome");//stringbuilder declare
        StringBuffer sf=new StringBuffer("Thanks");//Stringbuffer declare//
       StringBuilder sb1=sb.append("to java");//append - add to end//
        System.out.println(sb1.toString());//to print
        StringBuffer sf1=sf.insert(6,"for coming");//insert at a position
        System.out.println(sf1.toString());//to print
        System.out.println(sb.reverse());//to reverse
        System.out.println(sf.reverse());

    }
}
