
package com.mycompany.javatutorial;  //Work In Progress

import java.util.Scanner;  //Work In Progress
public class Arithmetic {
    public static void main (String[] args){
        
        Scanner input = new Scanner (System.in);  //Work In Progress
        
        int price, numberInstallment, installmentmonth;
       
        System.out.println("Price 1800$");  //Work In Progress
        price = 1800;
                                   //Work In Progress
        
        System.out.print("Enter Number Installment : ");
        numberInstallment = input.nextInt(); //Work In Progress
        
        installmentmonth = price/numberInstallment;               //Work In Progress
        
        System.out.println("Your Monthly EMI : "+installmentmonth); //Work In Progress
        System.out.print("Your Monthly Interest : "+installmentmonth*interest); //Work In Progress
        System.out.print("%");  //Work In Progress
    }
    
}
