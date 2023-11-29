package temperatureconvvertor;
import java.util.*;
public class Temperatureconvvertor {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Farenhi to celsius converter");
        int n=s.nextInt();
        if(n==1){
            System.out.println("You have choosen a celsius to farenhit");
            System.out.println("enter value");
            double d=s.nextDouble();
            double c=d*1.8+32;
            System.out.println("Frabhent is");
            System.out.println(Math.round(c*10.0)/10.0);
            double p=(d-32)*5/9;}
        else if(n==2){
           System.out.println(" You have choosen a farenhit to celsius ");
            System.out.println("enter value");
            double d=s.nextDouble();
             double p=(d-32)*5/9;
            System.out.println("Celsius is");
            System.out.println(Math.round(p*10.0)/10.0);
            
        }else{
            System.out.println("not valid");
        }     
    }
    
   }
