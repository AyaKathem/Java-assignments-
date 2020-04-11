package ak223ej_assign1.Ferry;

public class Bus   extends Vehicle {
	
	public Bus (int inPassenger) {
		super.passenger = inPassenger;
		super.UsedSize = 20;
		super.MAX_PASSENGERS = 20;
		super.PassCost = (10 * passenger);
		super.vCost = 200;
	}

}
