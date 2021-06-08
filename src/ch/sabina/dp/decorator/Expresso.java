package ch.sabina.dp.decorator;

public class Expresso extends Coffee {
	Expresso(){
		this.name= "Expresso";
		this.description="Expresso black coffee";
	}

	@Override
	public double getCost() {
	
		return 1.99;
	}

}
