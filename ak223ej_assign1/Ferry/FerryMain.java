package ak223ej_assign1.Ferry;


import java.util.Iterator;

public class FerryMain {
public static void main(String[] args) {
		
		
//	Object of cars
	FerryPlatform platform = new FerryPlatform();
	Bus IDBUS1= new Bus(2);
	Bus IDBUS2 = new Bus(20);
	Bus IDBUS3 = new Bus(2);
	Lorry IDLorry1 = new Lorry (2);
	Lorry IDLorry2 = new Lorry (2);
	Lorry IDLorry3 = new Lorry (2);
	Car acs = new Car(3);
	Bicycle y22 = new Bicycle ();
	Bicycle tt22 = new Bicycle ();
	
	

	Passenger passenger = new Passenger();
	
	platform.embark(acs);
	platform.embark(passenger);
	platform.embark(passenger);
	platform.embark(IDLorry3);
	platform.embark(IDLorry2);
	platform.embark(IDLorry1);
	platform.embark(IDBUS1);
	platform.embark(IDBUS3);
	platform.embark(IDBUS2);
	platform.embark(tt22);
	platform.embark(y22);
	


	 
//	Print out
	System.out.println("Number of people in the Ferry " + (platform.countPassengers() ) );
	System.out.println("Used size in the Ferry " + platform.countVehicleSpace());
	int money = platform.countMoney();
	System.out.println("Total Money " + money );
	
	
	Iterator<Vehicle> vec = platform.iterator();
	int Lorry =1;
	int Bus =1;
	int Car =1;
	int Bicycl =1;
	while(vec.hasNext()) {
		int WhichVec = vec.next().UsedSize;
		if (WhichVec == 40){
			
		System.out.println("Lorry"+ Lorry++);
		}else if (WhichVec ==20 ){
			System.out.println("Bus" + Bus++);
	}else if (WhichVec == 5){
		System.out.println("car"+ Car++);
		
		}else if (WhichVec == 1){
			System.out.println("Bicycl" + Bicycl++);
	}
	}

	platform.disembark();	
	
	System.out.println("Number of people in the Ferry " + platform.countPassengers());
	System.out.println("Used size in the Ferry " + platform.countVehicleSpace());
	System.out.println("Total Monay  " + money );

	}
}
