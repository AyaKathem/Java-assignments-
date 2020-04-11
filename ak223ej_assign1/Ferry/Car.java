package ak223ej_assign1.Ferry;

public class Car extends Vehicle{
	
	public Car (int inPassenger) {
		
		super.passenger = inPassenger;
		super.UsedSize = 5;
		super.MAX_PASSENGERS = 4;
		super.PassCost = (15 *passenger);
		super.vCost = 100;
	}
}
