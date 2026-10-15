import java.util.*;
public class Employeesalaryslip{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);//reading values from employee
        System.out.println("Employee name:");
        String name=S.nextLine();
        System.out.println("Employee id");
        int id=S.nextInt();
        S.nextLine();
        System.out.println("Employee dept");
        String dept=S.nextLine();
        System.out.println("Employee basic pay:");
        double bp=S.nextDouble();
        System.out.println("Employee da");//dear allowance
        double da=S.nextDouble();
System.out.println("Employee hra");//house rental allowance
double hra=S.nextDouble();
System.out.println("Employee bonus");
double bonus=S.nextDouble();
System.out.println("Employee deductions");
double deduct=S.nextDouble();
double grosssalary=bp+ da+ hra+ bonus;
double netsalary = grosssalary-deduct;
//printing slip
System.out.println("___________________________________________________________________");
System.out.println("EMPLOYEE SALARY SLIP");
System.out.println("-------------------------------------------------------------------");
System.out.println("EMPLOYEE NAME          :"+name);
System.out.println("EMPLOYEE ID            :"+id);
System.out.println("EMPLOYEE DEPARTMENT    :"+ dept);
System.out.println("EMPLOYEE BASIC PAY     :"+bp);
System.out.println("EMPLOYEE DA            :"+da);
System.out.println("EMPLOYEE HRA           :"+hra);
System.out.println("EMPLOYEE BONUS         :"+bonus);
System.out.println("EMPLOYEE DEDUCTION     :"+deduct);
System.out.println("EMPLOYEE GROSS SALARY  :"+grosssalary);
System.out.println("EMPLOYEE NET SALARY    :"+netsalary);
System.out.println("-------------------------------------------------------------------");
System.out.println("___________________________________________________________________");


    }
}