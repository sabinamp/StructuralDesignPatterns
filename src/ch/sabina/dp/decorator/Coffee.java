package ch.sabina.dp.decorator;

public abstract class Coffee {
	protected String description;
	protected String name;
	
	public String getDescription() {
		return this.description;
	}
	
	public String getName() {
		return this.name;
	} 
	
	public abstract double getCost();

}
