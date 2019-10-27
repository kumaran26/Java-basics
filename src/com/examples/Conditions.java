package com.examples;

public class Conditions {
	
	public static void main(String args[]) {

		boolean isFruitsInBasket = true;

		if(isFruitsInBasket){
			int appleCount = 5;
			System.out.println(appleCount);
		}
		//System.out.println(appleCount); // appleCount cannot be accessed outside the if scope

		boolean isGreenLightOn = false;
		boolean isRedLightOn = true;
		if(isGreenLightOn){
			System.out.println("Start Driving");
		} else if (isRedLightOn){
			System.out.println("Stop Driving");
		} else {
			System.out.println("Drive slowly");
		}

		int number = 3;
		if(number % 2 != 0) {
			System.out.println("Not divisible by 2");
			if(number < 5) {
				System.out.println("Number less than 5");
			}
		}

		String subject = "science";
		switch(subject){
			case "science":
				System.out.println("subject : science");
				break;
			case "history":
				System.out.println("subject : history");
				break;
			default:
				System.out.println("subject : out of syllabus");
				break;
		}

	}

}
