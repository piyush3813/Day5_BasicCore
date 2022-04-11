package com.bridgelabz;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Quotient_Reminder {
    static Logger logger = Logger.getLogger(Quotient_Reminder.class);
    public static void main (String[] args){
        BasicConfigurator.configure();
        logger.info("enter the number you want for quotient and reminder with \n\n ");

        Scanner sc = new Scanner(System.in);
         logger.info("enter a number for dividend");
         int divi = sc.nextInt();
         logger.info("enter a number for divisor");
         int divisor = sc.nextInt();

         int quotient = divi/divisor;
        logger.info("QUOTIENT = "+ quotient);
        int reminder = divi%divisor;
        logger.info("REMINDER = "+reminder);


    }
}
