package com.bridgelabz;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Prime_Factorization {
    static Logger logger = Logger.getLogger(Prime_Factorization.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        Scanner sc = new Scanner(System.in);
        logger.info("enter a value you want prime factorization for : ");
        int p = sc.nextInt();

        for (int i = 2; i<p;i++){
            while(p%i==0){
                logger.info(i+" ");
                p= p/i;

            }
        }
        if (p>2){
            logger.info(p);
        }

    }
}
