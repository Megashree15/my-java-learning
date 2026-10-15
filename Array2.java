import java.util.*;
public class Array2{
    public static void main(String args[]){
int[] arr2={6,3,7,1,2,9};
System.out.println(Arrays.toString(arr2));//to print array//
System.out.println(arr2.length);//to find length
Arrays.sort(arr2);
System.out.println(Arrays.toString(arr2));//sorting and printing//
int ind1=Arrays.binarySearch(arr2,3);//searching the index of an element//
int ind=Arrays.binarySearch(arr2,5);
System.out.println(ind);
System.out.println(ind1);
int[] arr3=Arrays.copyOf(arr2,arr2.length);//coying an array//
System.out.println(Arrays.toString(arr3));
int[] arr4=Arrays.copyOf(arr2,4);//copying only some elements//
System.out.println(Arrays.toString(arr4));
Arrays.fill(arr3,5);//filling an array with only one value//
Arrays.fill(arr4,9);
System.out.println(Arrays.toString(arr3));
System.out.println(Arrays.toString(arr4));
System.out.println(Arrays.equals(arr3,arr4));//compare






    }
}
