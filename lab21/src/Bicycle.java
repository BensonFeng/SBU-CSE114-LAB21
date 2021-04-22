public class Bicycle extends Vehicle {
	private String Name;
	private int Wheels;
	public Bicycle() {}
	public Bicycle(String name) {
		Name = name;
		Wheels = 2;
		}
	public int getWheels() {
		return this.Wheels;
		}
	public String getName() {
		return this.Name;
		}
	}