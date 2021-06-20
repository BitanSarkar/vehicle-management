package com.sapient.vehicle;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Bitan Sarkar
 *
 */
public class App {
	static Vehicle obj = new Vehicle();

	public static int updateDB() {
		Scanner ob = new Scanner(System.in);
		System.out.print("Do you want to update database (yes: 1, no: 0): ");
		if (ob.nextInt() == 1) {
			System.out.print("Enter type of vehicle : ");
			String vehicleType = ob.nextLine();
			if (!obj.vehicle.containsKey(vehicleType))
				obj.vehicle.put(vehicleType, new HashMap<String, HashMap<String, HashMap<String, String>>>());
			System.out.print("Enter company name of " + vehicleType + " : ");
			String companyName = ob.nextLine();
			if (!obj.vehicle.get(vehicleType).containsKey(companyName))
				obj.vehicle.get(vehicleType).put(companyName, new HashMap<String, HashMap<String, String>>());
			System.out.print("Enter model of " + companyName + " " + vehicleType + " : ");
			String model = ob.nextLine();
			if (!obj.vehicle.get(vehicleType).get(companyName).containsKey(model))
				obj.vehicle.get(vehicleType).get(companyName).put(model, new HashMap<String, String>());
			System.out.print("Enter nut model : ");
			obj.vehicle.get(vehicleType).get(companyName).get(model).put("Nut model", ob.nextLine());
			System.out.print("Enter nut dimension : ");
			obj.vehicle.get(vehicleType).get(companyName).get(model).put("Nut dimension", ob.nextLine());
			return 1;
		}
		return 0;
	}

	public static void getDimensions(Vehicle vehicle) {
		for (String vehicleType : obj.vehicle.keySet())
			for (String companyName : obj.vehicle.get(vehicleType).keySet())
				for (String model : obj.vehicle.get(vehicleType).get(companyName).keySet()) {
					String nutModel = obj.vehicle.get(vehicleType).get(companyName).get(model).get("Nut model");
					String nutDim = obj.vehicle.get(vehicleType).get(companyName).get(model).get("Nut dimension");
					System.out.println(companyName + " " + model + " " + vehicleType + " : nut model : " + nutModel
							+ " nut dimension : " + nutDim);
				}
	}

	public static void main(String[] args) {
		while (updateDB() == 1)
			;
		getDimensions(obj);
	}
}
