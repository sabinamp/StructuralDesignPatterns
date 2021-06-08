package ch.sabina.dp.decorator;

public class SugarCoffeeDecorator implements CoffeeDecorator{
	private Coffee coffee ;
	
	SugarCoffeeDecorator(Coffee c){
		this.coffee = c;
	}
	
	@Override
	public double getCost() {
		//sugar cost
		return this.coffee.getCost()+20;
	}

	@Override
	public String getDescription() {
		
		return coffee.getDescription();
	}

	@Override
	public String getName() {
		
		return coffee.getName();
	}

}
