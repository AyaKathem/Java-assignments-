package ak223ej_assign1.Ferry;




public abstract class Vehicle {
	protected int passenger;
	protected int UsedSize;
	protected int PassCost;
	protected int MAX_PASSENGERS;
	protected int vCost;
	protected static int IDNR = 0;
	protected int ID;
	
//	Constructor
	public Vehicle () {
	
		this.ID = IDNR++;
	}
	
/*
 * Set passenger cost
 */
	public  void setPassengerCost() {
		if(checkNumOfPass() == true)
			totalMony();
		else 
			System.out.println("There is no space left, Sorry!");
	}
			
/*
 * 
 * return total cost of the vehicle and passangers
 */
	public  int totalMony()  {
		int cost = PassCost +  vCost;
		
		return cost;
	}
	
	
/*
 * Check if there is enougth space fo passenger
 * return true if there is enough
 */
	private  boolean checkNumOfPass() {
		boolean tooMany ;
		int pass = getPassenger() + this.passenger;
		if(pass > this.MAX_PASSENGERS)
			tooMany = true;
		else 
			tooMany= false;
		
		return tooMany;
	}

/*return size of vehicle
 */
	public int sizeOfVehicle() {
		return this.UsedSize;
	}
	
/*return number of passenger
 */
	public int getPassenger() {
		
		return this.passenger;
	}
}
