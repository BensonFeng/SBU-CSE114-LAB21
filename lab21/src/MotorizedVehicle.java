public class MotorizedVehicle extends Vehicle {
	private String Name;	
	private int Wheels;		
	private double engineSize;
	public MotorizedVehicle() {}
	public MotorizedVehicle(String name, int wheels, double size) {
		this.Name = name;
		this.Wheels = wheels;
		this.engineSize = size;
		}
	public String getName() {
		return this.Name;
		}
	public int getWheels() {
		return this.Wheels;
		}
	public double getEngineSize() {
		return this.engineSize;
		}
	public double getHorsePower() {
		return (this.engineSize * this.Wheels);
		}
	}