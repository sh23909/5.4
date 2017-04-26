import javax.swing.JOptionPane;

public class CarDriver {
	public static void main(String [] args){
		System.out.println("Number of cars: " + Car.getcount());
		String color=JOptionPane.showInputDialog("Enter color:");
		int hp=Integer.parseInt(JOptionPane.showInputDialog("Enter horse power:"));
		double engineSize=Double.parseDouble(JOptionPane.showInputDialog("Enter engine size:"));
		String make=JOptionPane.showInputDialog("Enter make:");
		
		Car myCar=new Car(color, hp, engineSize, make);
		Car hisCar=new Car("Black",400,3.5,"Honda");
		Car herCar=new Car("pink",300,2.5,"Volks");
		
		
		System.out.println(myCar);
		System.out.println(hisCar);
		System.out.println(herCar);
		myCar.setColor("Blue"); 
		myCar.sethp(650); 
		myCar.setengineSize(6.5);
		myCar.setmake("Ferrari");
		
		hisCar.setColor("Blue"); 
		hisCar.sethp(650); 
		hisCar.setengineSize(6.5);
		hisCar.setmake("Ferrari");
		
		herCar.setColor("Blue"); 
		herCar.sethp(650); 
		herCar.setengineSize(6.5);
		herCar.setmake("Ferrari");
		System.out.println(myCar.getcolor() + " " + myCar.gethp() + " " + myCar.getengineSize() + " " + myCar.getmake() + " "); 
		System.out.println(hisCar.getcolor() + " " + hisCar.gethp() + " " + hisCar.getengineSize() + " " + hisCar.getmake() + " "); 
		System.out.println(herCar.getcolor() + " " + herCar.gethp() + " " + herCar.getengineSize() + " " + herCar.getmake() + " "); 
		System.out.println("Number of cars: " + Car.getcount());
		System.out.println("My car = His car? " + myCar.equals(hisCar));
		System.out.println("His car = Her car? " + hisCar.equals(herCar));
		System.out.println("Her car = My car? " + herCar.equals(myCar));
	}

}
