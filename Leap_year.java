package com.bridgelabz;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Leap_year {
    static Logger logger= Logger.getLogger(Leap_year.class);
    public static void main(String[] args){

        BasicConfigurator.configure();

        logger.info("enter the year you want to check for leap year");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if ((y%4==0)&&(y%100!=0)||(y%400==0)){
            logger.info("entered year is an leap year");
        }
        else{
            logger.info("entered year is not an leap year");
        }

    }
}
