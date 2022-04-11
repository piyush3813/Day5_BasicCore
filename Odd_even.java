package com.bridgelabz;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Odd_even {

    static Logger logger = Logger.getLogger(Odd_even.class);

    public static void main(String[] args){

        BasicConfigurator.configure();
        logger.info("enter a number you want you check for odd OR even");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0){
            logger.info("given number is Even ");
        }
        else if (a==0){
            logger.info("it is neither odd nor even ");
        }
        else {
            logger.info("given number is odd");
        }

    }
}