                                                            //if else
import java.util.Scanner;
public class ifconditionprg{
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark");
        int mark=sc.nextInt();
        
        if(mark>=50 && mark<=100){
        System.out.println("you got pass mark");
        }
        else if(mark>100){
        System.out.println("Enter the proper mark");
        }
        else{
        System.out.println("you got fail");        
        }
        
        
        
}
}
