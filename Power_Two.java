package com.bridgelabz;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Power_Two {
  static   Logger logger = Logger.getLogger(Power_Two.class);

    public static void main(String[] args){
        BasicConfigurator.configure();
        logger.info("enter a number under 31 to calculate 2 table until that number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int z = (int) Math.pow(2,a);
        for (int i=0 ; i<=z; i++){
            logger.info(2*i);
        }
    }
}
