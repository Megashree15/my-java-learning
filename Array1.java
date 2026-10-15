import java.util.Arrays;
public class Array1{
    public static void main(String args[]){
int[] arr1={13,99,105,55,63,1,15,77,42};// we know the exact values here or use int[] arr1 =new int[6] if we know the length of arary//
System.out.println(Arrays.toString(arr1));//to print array//
System.out.println(arr1.length);//to find length of array//
System.out.println(arr1[arr1.length-1]);//accessing  last and first using index//
System.out.println(arr1[0]);
arr1[0]=5;//updating an element//
arr1[arr1.length-1]=33;
System.out.println(Arrays.toString(arr1));
for(int i=arr1.length-1;i>=0;i--){//reverse print
    System.out.println(arr1[i]);
}

    }
}

