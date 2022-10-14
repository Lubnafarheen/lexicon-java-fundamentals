package org.lubna.fundamentals.week1;

import java.util.Scanner;

public class TimeConversion {


    public static void main(String[] args) {

        int seconds = 80199;

        int remainingHours;

        int hours = seconds / 3600;
        remainingHours = seconds % 3600;
        int minutes = remainingHours / 60;
        int convMinuteToSec = remainingHours % 60;


        System.out.println(hours + ":" + minutes + ":" + convMinuteToSec);















        }
    }