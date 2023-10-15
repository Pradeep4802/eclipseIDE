package com.design.pattern;

interface Vehicle {
	void start();
}

//class Car implements Vehicle {
//	public void start() {
//		System.out.println("Car started");
//	}
//}
//class MotorCycle implements Vehicle {
//	public void start() {
//		System.out.println("MotorCycle started");
//	}
//}

//abstract class VehicleFactory {
//	abstract Vehicle createVehicle();
//}

class CarVehicle {
	Vehicle createVehicle() {
		return new Vehicle() {
			public void start() {
				System.out.println("Car started");
			}
		};
	}
}
class MotorCycleVehicle {
	Vehicle createVehicle() {
		return new Vehicle() {
			public void start() {
				System.out.println("MotorCycle started");
			}
		};
	}
}

public class MainVehicle {
	public static void main(String[] args) {
		CarVehicle vf1 = new CarVehicle();
		vf1.createVehicle().start();
		System.out.println("-------------------------------------------");
		MotorCycleVehicle vf2 = new MotorCycleVehicle();
		vf2.createVehicle().start();
	}
}
