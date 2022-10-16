package org.lubna.fundamentals.week1;

public class TimeConversion {

    public static final int NUM_OF_MINUTES_IN_ONE_HOUR = 60;
    public static final int NUM_OF_SECONDS_IN_ONE_MINUTE = 60;
    public static final int NUM_OF_SECONDS_IN_ONE_HOUR = NUM_OF_MINUTES_IN_ONE_HOUR * NUM_OF_SECONDS_IN_ONE_MINUTE;

    public static void main(String[] args) {
        int userInputInSeconds = 81000;
        String time = convertSecondsToRailwayTime(userInputInSeconds);
        System.out.println(time);
    }

    private static String convertSecondsToRailwayTime(int userInputInSeconds) {
        int hours = userInputInSeconds / NUM_OF_SECONDS_IN_ONE_HOUR;
        int remainingSeconds = userInputInSeconds % NUM_OF_SECONDS_IN_ONE_HOUR;

        int minutes = remainingSeconds / NUM_OF_MINUTES_IN_ONE_HOUR;
        remainingSeconds = remainingSeconds % NUM_OF_MINUTES_IN_ONE_HOUR;

        return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
    }
}