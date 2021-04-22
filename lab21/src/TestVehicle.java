public class TestVehicle {
	public static void main(String[] args) {
		Bicycle x = new Bicycle("Owner");
		System.out.println("The owner name is "+x.getName());
		System.out.println("Numbers wheels of bicycle: "+x.getWheels());

		MotorizedVehicle car = new MotorizedVehicle("Monorized Vehicle", 4, 4);		
		System.out.println("The owner of the vehicle is "+car.getName());
		System.out.println("The numbers of wheels is "+car.getWheels());
		System.out.println("The engine volume is "+car.getEngineSize());
		System.out.println("The Horse Power is "+car.getHorsePower());
	} 	
} 


