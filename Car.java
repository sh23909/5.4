
public class Car {
	private String color;
	private int hp;
	private double engineSize;
	private String make;
	public Car(){
		this("white", 250, 4.0, "Toyota");
		//color= "white";
		//hp= 250;
		//engineSize=4.0;
		//make="Toyota";
	}
	public Car(String color, int hp, double engineSize, String make){
		this.color=color;
		this.hp=hp;
		this.engineSize=engineSize;
		this.make=make;
		
		
	}
	public void setColor(String color){
		this.color=color;
	}
	public void sethp(int hp){
		this.hp=hp;
	}
	public void setengineSize(double engineSize){
		this.engineSize=engineSize;
	}
	public void setmake(String make){
		this.make=make;
	}
	public String getcolor(){
		return color;
	}
	public int gethp(){
		return hp;
	}
	public double getengineSize(){
		return engineSize;
	}
	public String getmake(){
		return make;
	}
	public String toString(){
		return "Color: " + color + "\nHorse Power: " + hp + "\nEngine Size: " + engineSize + "\nMake: " + make;
	}

}
