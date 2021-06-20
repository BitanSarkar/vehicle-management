package com.sapient.vehicle;

import java.util.HashMap;
import java.util.ArrayList;

/**
 * @author Bitan Sarkar
 *
 */
public class Vehicle {
	HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>> vehicle;

	public Vehicle() {
		vehicle = new HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>();
		storeDummy();
	}

	public void storeDummy() {
		vehicle.put("car", new HashMap<String, HashMap<String, HashMap<String, String>>>());
		vehicle.put("truck", new HashMap<String, HashMap<String, HashMap<String, String>>>());
		vehicle.get("car").put("BMW", new HashMap<String, HashMap<String, String>>());
		vehicle.get("car").put("Maruti", new HashMap<String, HashMap<String, String>>());
		vehicle.get("truck").put("Volvo", new HashMap<String, HashMap<String, String>>());
		vehicle.get("truck").put("TATA", new HashMap<String, HashMap<String, String>>());
		vehicle.get("car").get("BMW").put("X3", new HashMap<String, String>());
		vehicle.get("car").get("BMW").put("X6", new HashMap<String, String>());
		vehicle.get("car").get("Maruti").put("800", new HashMap<String, String>());
		vehicle.get("car").get("Maruti").put("Swift", new HashMap<String, String>());
		vehicle.get("truck").get("Volvo").put("FMX", new HashMap<String, String>());
		vehicle.get("truck").get("Volvo").put("FH1", new HashMap<String, String>());
		vehicle.get("truck").get("TATA").put("MHCV", new HashMap<String, String>());
		vehicle.get("truck").get("TATA").put("ICV", new HashMap<String, String>());
		vehicle.get("car").get("BMW").get("X3").put("Nut model", "M3X1");
		vehicle.get("car").get("BMW").get("X3").put("Nut dimension", "13x12");
		vehicle.get("car").get("BMW").get("X6").put("Nut model", "M4X5");
		vehicle.get("car").get("BMW").get("X6").put("Nut dimension", "10x11");
		vehicle.get("car").get("Maruti").get("800").put("Nut model", "M2X2");
		vehicle.get("car").get("Maruti").get("800").put("Nut dimension", "10x10");
		vehicle.get("car").get("Maruti").get("Swift").put("Nut model", "M1X2");
		vehicle.get("car").get("Maruti").get("Swift").put("Nut dimension", "5x5");
		vehicle.get("truck").get("Volvo").get("FMX").put("Nut model", "M30X10");
		vehicle.get("truck").get("Volvo").get("FMX").put("Nut dimension", "103x102");
		vehicle.get("truck").get("Volvo").get("FH1").put("Nut model", "M04X50");
		vehicle.get("truck").get("Volvo").get("FH1").put("Nut dimension", "100x101");
		vehicle.get("truck").get("TATA").get("MHCV").put("Nut model", "M20X20");
		vehicle.get("truck").get("TATA").get("MHCV").put("Nut dimension", "100x010");
		vehicle.get("truck").get("TATA").get("ICV").put("Nut model", "M01X02");
		vehicle.get("truck").get("TATA").get("ICV").put("Nut dimension", "05x50");

	}
}
