package ch.sabina.dp.flyweight;

public class RubyPlatform implements Platform {

	@Override
	public void executeCode(Code code) {

		System.out.println("Compiling and executing Ruby code.");
	}

}
