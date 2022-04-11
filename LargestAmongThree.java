package com.bridgelabz;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class LargestAmongThree {
    static Logger logger = Logger.getLogger(LargestAmongThree.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();
        logger.info("enter 1st number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        logger.info("enter 2nd number ");
        int b = sc.nextInt();
        logger.info("enter 3rd number ");
        int c = sc.nextInt();
        if ((a > b) && (a > c)) {
            logger.info(a + " is the largest among three");
        } else if ((b > a) && (b > c)) {
            logger.info(b + " is the largest among three");
        } else {
            logger.info(c + " is the largest among three");
        }
    }
}
