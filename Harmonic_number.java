package com.bridgelabz;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Harmonic_number {
    static Logger logger = Logger.getLogger(Harmonic_number.class);
    public static void main (String[] args){
        BasicConfigurator.configure();
        double i;

        Scanner sc = new Scanner(System.in);

        logger.info("enter a number you want to check for harmonic number ");
        int num = sc.nextInt();
        double harmonic=1;

        for ( i = 1 ; i<= num ; i++){
            harmonic+= harmonic+( 1 / i);
            logger.info("harmonic number "+ i+" = "+harmonic);
        }

        logger.info(num+"th harmonic number is  "+ harmonic);
    }

}
