import java.util.*;
public class Strings3{
    public static void main(String args[]){
        String str="Learn java";
        //text manipulation
        String sub=str.substring(0,4);
        System.out.println(sub.toString());//substring
        String replaced=str.replace("Learn","Welcome to");
        System.out.println(replaced.toString());//replaces text
        System.out.println(str.contains("java"));//checks for content
        System.out.println(str.contains("sql"));
        String trimmed=str.trim();
        System.out.println(trimmed);//cleans spaces
        String[] spacearray=str.split(" ");
        System.out.println(Arrays.toString(spacearray));//splits at comma and space
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

    }
}