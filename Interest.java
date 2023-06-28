//Java program for calculating Simple Interest
//and Compound Interest
/*Let's Begin */
import java.util.Scanner;
class Interest
{
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("For calculating Simple Interest Enter 1");
      System.out.println("For calculating Coumpound Interest Enter 2");
      int n=sc.nextInt();
      switch(n)
      {
         case 1: System.out.println("// Simple Interest Calculation //");
                  System.out.println("Enter Principal Amount");
                  float p=sc.nextFloat();
                  System.out.println("Enter Rate Of Interest");
                  float r=sc.nextFloat();
                  System.out.println("Enter time (in Years)");
                  int t=sc.nextInt();
                  float si=(p*r*(float)t)/100;
                  System.out.println("Simple Interest =");
                  System.out.format("%.2f",si);
                  break;

         case 2: System.out.println("// Compound Interest Calculation //");
                  System.out.println("Enter Principal Amount");
                  float p1=sc.nextFloat();
                  System.out.println("Enter Rate of interest");
                  float r1=sc.nextFloat();
                  System.out.println("enter number of times interest applied in an year");
                  int n1=sc.nextInt();
                  System.out.println("Enter number of years");
                  int t1=sc.nextInt();
                  float ci=p1*(float)Math.pow((1+(r1/100)/(float)n1),(float)(n1*t1))-p1;
                  System.out.println("Compound Interest =");
                  System.out.format("%.2f",ci);
                  break;
         default: System.out.println("Wrong Input");
      }
         sc.close();       
      }
}