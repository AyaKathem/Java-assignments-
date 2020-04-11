package ak223ej_assign1.Ferry;

public class Passenger {

	private int passenger;
	private int cost;
	public Passenger() {
		this.passenger = 1;
		this.cost = 20;
	}
	
	/*return total cost for passengers
	 */
	public int getCost() {
		return this.cost * passenger;
	}
	
	/*return passengers number
	 */
	public int getPassenger() {
		
	
		return this.passenger++;
	}

}
