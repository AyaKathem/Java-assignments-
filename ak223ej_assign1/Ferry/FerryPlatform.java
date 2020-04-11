package ak223ej_assign1.Ferry;


import java.util.Iterator;


public class FerryPlatform implements Ferry{
	
	private int VehicleSize =0;
	private int PassengerSize =0;
	private int CountPeople =0;
	private int spacePass = 200;
	private int spaceV= 200;
	private Vehicle[] vehicles = new Vehicle[this.spaceV];
	private Passenger[] pers = new Passenger[this.spacePass];
	
	
/* counts the total number of passengers 
 * return how many people on ferry
 */
	@Override
	public int countPassengers() {
		int CountPasswithVic = 0;
		int CountPass = 0;
		Passenger passenger = new Passenger();
		for(int i = 0; i < PassengerSize; i++){
			CountPass = passenger.getPassenger() ;
		}
		for(int j = 0; j < VehicleSize; j++){
			CountPasswithVic += vehicles[j].getPassenger() ;
		}
		
		
		int totalPass = CountPasswithVic + CountPass ;
		
		return totalPass ;
	}
	
/*
 * 
 * return used space by vehicle
 */
	@Override
	public int countVehicleSpace() { //////
		int vehicleSpace = 0;
		for(int i = 0; i <VehicleSize; i++)
			vehicleSpace += vehicles[i].UsedSize;
			
		return vehicleSpace;
	}
	
/*
 * 
 * return total money
 */
	@Override
	public int countMoney() {
		int totalMoney = 0;
		int i = 0; 
		int j = 0; 
			while(	i <VehicleSize){
				
			totalMoney += vehicles[i++].totalMony();
		}
		while ( j < this.CountPeople){
			totalMoney += pers[j++].getCost();
		}
		return totalMoney;
		
	}
	
/*
 * Embark a vehicle on the ferry
 * an check if the ferry is full 
 */
	@Override
	public void embark(Vehicle v) {
		for(int i = 0; i <VehicleSize; i++) {
			if(this.vehicles[i].equals(v)) {
				System.err.println("Can´t embark vehicle two times!");
				return;
			}
		}
		if(hasSpaceFor(v) == true) {	
			this.vehicles[VehicleSize++] = v;
		}
		else
				System.out.println("There is no space left, Sorry!");

	}
	
/*
 * Empty the ferry 
 * 
 */
	@Override
	public void disembark() {  
		int i = VehicleSize -1;
		while( i >=  0){
			this.vehicles[i--] = null;
		}
		int j =PassengerSize -1;
		while( j >= 0){
			this.pers[j--] = null;
		}
		VehicleSize = 0;
		PassengerSize = 0;	
	}
	
/* return true is space left for more vehicle
 */
	@Override
	public boolean hasSpaceFor(Vehicle v) {
		
		boolean hasSpaceForVehicle ;
		if(v.UsedSize + countVehicleSpace() >= this.spaceV)
			 hasSpaceForVehicle = false;
		else
			hasSpaceForVehicle = true;
		return hasSpaceForVehicle;
	}

/*
 * Iterator
 */
	@Override
	public Iterator<Vehicle> iterator() {
		// TODO Auto-generated method stub
		return new VehicleIterator() ;
	}

/*
 * Embark passenger 
 * and check if there is enough room
 */
	@Override
	public void embark(Passenger p) {
		
		if(hasRoomFor(p) == true) {
			
			this.pers[PassengerSize++] = p;
		}
		else
				System.out.println("There is no space left, Sorry!");
	}

/**
 * 
 * @return true if there is space for more passengers 
 */
	@Override
	public boolean hasRoomFor(Passenger p) {
		boolean hasSpaceForPeople;
	
		
		if(countPassengers() >=this.spacePass)
			hasSpaceForPeople = false;
		
		else 
			hasSpaceForPeople = true;
			
		return hasSpaceForPeople;
	}
	
	
	/*Private inner class */
	class VehicleIterator implements Iterator<Vehicle> {
		private int count = 0;
		public Vehicle next() {return vehicles[count++];}
		
		public boolean hasNext() {return count < VehicleSize;}
		
		public void remove() {
			throw new RuntimeException("remove() is not implemented");
		}
	}
}
