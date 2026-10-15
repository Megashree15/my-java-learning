import java.util.*;
public class Even {
    public static void main(String args[]){
        //even and odd  numbers between 1 and 5
        //using for
        System.out.println("for");//for
        for(int i=1;i<5;i++){
            if(i%2==0){
                System.out.println("even "+i);
            }
            if(i%2!=0)
                {
                System.out.println("odd"+i);
            }
        }
            //while
            System.out.println("while");//while
           int j=1;
           while(j<5){
            if(j%2==0){
                System.out.println("even"+j);
            }
            if(j%2!=0){
                System.out.println("odd"+j);
            }
            j++;
           }
           System.out.println("do while");//do while
           //do while
           int k= 1;
           do{
            if(k%2==0){
                System.out.println("even"+k);
            }
            else{
                System.out.println("odd"+k);
            }
            k++;
           }
           while(k<5);

        }
    }
    

