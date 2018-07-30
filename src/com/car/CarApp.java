package com.car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		
		int arraySize = 0;
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Car> cars = new ArrayList<>();
		
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		
		// get number of cars from user
		arraySize = Validator.getInt(scan, "How many cars are you entering?");
		
		String userMake;
		String userModel;
		int userYear;
		double userPrice;
		
		// get car details from user, validate inputs
		for (int i = 0; i < arraySize; i++) {
			
			scan.nextLine(); // garbage line
			
			userMake = Validator.getString(scan, "Enter Car #" + (i+1) + " Make: ");
			userModel = Validator.getString(scan, "Enter Car #" + (i+1) + " Model: ");
			userYear = Validator.getInt(scan, "Enter Car #" + (i+1) + " Year: ", 1672, 2018);
			userPrice = Validator.getDouble(scan, "Enter Car #" + (i+1) + " Price: ");
			
			//add car details to ArrayList
			cars.add(new Car (userMake, userModel, userYear, userPrice));
		}
		
		System.out.println();
		System.out.println("Current Inventory:");
		
		// print ArrayList to console and exit
		for (Car c : cars) {
			System.out.println(c);
		}
		scan.close();
	}
}
