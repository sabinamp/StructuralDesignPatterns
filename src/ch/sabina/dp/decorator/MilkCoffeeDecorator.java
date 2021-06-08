package ch.sabina.dp.decorator;

public class MilkCoffeeDecorator implements CoffeeDecorator{
	private Coffee coffee ;
	
	MilkCoffeeDecorator(Coffee c){
		this.coffee = c;
	}
	
	@Override
	public double getCost() {
		
		return this.coffee.getCost()+5;
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
