package com.car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Car> cars = new ArrayList<>();
		cars = fillArrayList(cars);

		// loop menu
		boolean cont = true;
		while (cont == true) {
			int i = 0;
			
			// print numbered inventory
			System.out.println("Current Inventory:\n");
			for (i = 0; i < cars.size(); i++) {
				System.out.println((i + 1) + ". " + cars.get(i));
			}
			System.out.println((i + 1) + ". " + "Quit\n");

			int userCar = Validator.getInt(scan, "Which car would you like?\n", 1, (cars.size() + 1));
			
			// (i + 1) is quit
			if (userCar == (i + 1)) {
				System.out.println("Have a great day!");
				break;
			}

			// reprint selected car
			System.out.println(cars.get(userCar - 1));
			
			System.out.println("Would you like to buy this car?");
			scan.nextLine(); // garbage line
			
			// remove car if seleced, loop menu in either case
			if (scan.nextLine().equalsIgnoreCase("y")) {
				System.out.println("Excellent! Our finance department will be in touch shortly");
				cars.remove(userCar - 1);
			} else {
				continue;
			}
		}
		
		// end program
		cont = false;
		scan.close();
	}

	// populate ArrayList with cars
	public static ArrayList<Car> fillArrayList (ArrayList<Car> cars) {
		
		cars.add(new Car("Toyota", "Camry", 2018, 24638.99));
		cars.add(new Car("Honda", "Civic", 2018, 23749.99));
		cars.add(new Car("Nissan", "Altima", 2018, 20185.99));
		cars.add(new UsedCar("Chevrolet", "Malibu", 2002, 5200.00, 50230.60));
		cars.add(new UsedCar("Ford", "Focus", 2003, 6998.99, 23501.19));
		cars.add(new UsedCar("Dodge", "Charger", 1999, 4999.00, 3535.75));

		return cars;
	}
}
