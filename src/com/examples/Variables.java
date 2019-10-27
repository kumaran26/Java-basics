package com.examples;

public class Variables {

    public static void main(String [] args) {

        int a = 1;
        int b = 3;
        int c = a + b;
        System.out.println(c);

        int bulbCount; // variable declaration
        // System.out.println(bulbCount); // variable bulbCount might not have been initialized
        bulbCount = 4; // variable initialization
        System.out.println(bulbCount);

        bulbCount = bulbCount + 1; // Increment the variable
        System.out.println(bulbCount);

        // data types
        int science = 80;
        int history = 85;
        int totalMarks = science + history;
        double average = totalMarks / 2.0;
        System.out.println(average);

        // casting
        int roundedAverage = (int) average;
        System.out.println(roundedAverage);

        //char light = "O"; // Should not use double quotes
        char light = 'O';
        System.out.println(light);

        // string and its methods
        String siteName = "google";
        char [] siteNameCharacters = siteName.toCharArray();
        String siteNameWithSpace = " google ";
        System.out.println(siteName.charAt(0));
        System.out.println(siteName.length());
        System.out.println(siteName.concat(".com"));
        System.out.println(siteName.equalsIgnoreCase("google"));
        System.out.println(siteName.contains("gle"));
        System.out.println(siteName.isEmpty());
        System.out.println(siteName.toUpperCase());
        System.out.println(siteName.substring(3));
        System.out.println(siteName.replace("google", "google.com"));
        System.out.println(siteNameCharacters[1]);
        System.out.println(siteNameWithSpace.trim());

        boolean isLightOn = true;

        if(isLightOn && (a == 1)){
            System.out.println("Lights ON : " + isLightOn);
        }
    }
}
