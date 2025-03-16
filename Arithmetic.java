
package com.mycompany.javatutorial;

import java.util.Scanner;
public class Arithmetic {
    public static void main (String[] args){
        
        Scanner input = new Scanner (System.in);
        
        int price, numberInstallment, installmentmonth;
       
        System.out.println("Price 1800$");
        price = 1800;
        
        double interest = 1.5;
        
        System.out.print("Enter Number Installment : ");
        numberInstallment = input.nextInt();
        
        installmentmonth = price/numberInstallment;
        
        System.out.println("Your Monthly EMI : "+installmentmonth);
        System.out.print("Your Monthly Interest : "+installmentmonth*interest);
        System.out.print("%");
    }
    
}
