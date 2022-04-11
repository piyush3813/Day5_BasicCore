package com.bridgelabz;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Flip_coin {
    static Logger logger = Logger.getLogger(Flip_coin.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        Scanner sc = new Scanner(System.in);
        logger.info("enter the number of times you want to flip coin");
        int f = sc.nextInt();
        double head = 0;

        for (int i = 0; i<=f; i++){
            double flip = Math.random();
            if (flip<0.5){
                head = head+1;
            }

        }
        logger.info("P(H)= "+head/f);
        logger.info("P(T)"+(1-(head/f)));
    }
}
