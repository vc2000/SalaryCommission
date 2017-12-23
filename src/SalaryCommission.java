/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vc2000
 */
public class SalaryCommission {
     public static void main(String[] args){
        int yearsExp = 20;
        double annualSales = 695000;
        
        double Salary = 40000;
        double ComRate =  .02;
        double ComRateIncrement = .01;
                
        if (yearsExp < 2) {
            System.out.print("You have minimal, if any experience.");
        }else if (yearsExp <5){
            System.out.print("You have some valuable experience.");
            //assignment operater C+=A , C=C+A, salary = 40000+10000= 50000
            Salary += 10000;
        }else if (yearsExp <7) {
            System.out.print("With your experience you are very valuable to the company.");
            Salary += 20000;
        }else{
           System.out.print("With your experience you are very valuable to the company.");
            Salary += 30000; 
        }
        System.out.printf("Your annual salary is $%,.0f.", Salary);
        System.out.println();
        
        if (annualSales < 500000){
            System.out.print("You have minimal, if any experience.");
        }else if (annualSales <= 1000000){
            System.out.print("You have some valuable experience.");
            ComRate += ComRateIncrement;
        }else{
           System.out.print("Your Sales are FANTASTIC!" );
            ComRate += ComRateIncrement*2;
        }
        double Com = annualSales * ComRate;
        double annualCompensation = Com + Salary;
        
        System.out.println("Your commission rate is " + ComRate +". ");
        System.out.printf("Your annual commisstion is $%,.0f. ", Com);
        System.out.printf("\n\n ** Your annual compensation is $%,.0f. \n\n", annualCompensation);
        
    }
}
