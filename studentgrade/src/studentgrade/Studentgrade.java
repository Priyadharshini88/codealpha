package studentgrade;
import java.io.*;
import java.util.*;
public class Studentgrade {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.print("Enter no of subjects"+" ");
        int nofsub=s.nextInt();
        int total=0;
        for(int i=1;i<=nofsub;i++){
            System.out.print("Enter Mark "+i+" ");
            int marks=s.nextInt();
            total+=marks;       }
        double average=(double)total/(nofsub*100)*100;       
        System.out.println("your Average is "+String.format("%.2f", average));
        char grade;
        if(average>=90){
            System.out.println("Your grade is A");
        }else if(average>=80){
            System.out.println("Your grade is B");
        }else if(average>=70){
            System.out.println("Your grade is C");
        }else if(average>=60){
            System.out.println("Your grade is D");
        }else if(average>=50){
            System.out.println("Your grade is E");
        }
        else {
            System.out.println("Your grade is F");
 }}}
