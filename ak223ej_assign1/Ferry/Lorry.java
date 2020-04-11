package ak223ej_assign1.Ferry;

public class Lorry extends Vehicle{
	
	public Lorry(int inPassenger) {
		super.passenger = inPassenger;
		super.UsedSize = 40;
		super.MAX_PASSENGERS = 2;
		super.PassCost = (15* passenger);
		super.vCost = 300;
	}
}
