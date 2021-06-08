package ch.sabina.dp.bridge;

/*
 * The components of the Bridge Pattern comprise of an abstraction, refined abstraction, an implementer, and concrete implementer.
An abstraction defines the abstraction’s interface and also maintains a reference to an object of type implementer, and the link
between the abstraction and the implementer is called a Bridge.
Refined Abstraction extends the interface defined by the abstraction.
The Implementer provides the interface for implementation classes (concrete implementers).
And the Concrete Implementer implements the Implementer interface and defines its concrete implementation.
The Bridge Pattern decouples the interface and the implementation
 */
public interface Product {
	public String productName();
	public void produce();
}
