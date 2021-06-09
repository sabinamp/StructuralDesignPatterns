package ch.sabina.dp.flyweight;

public class CPlatform implements Platform {

	@Override
	public void executeCode(Code code) {

		System.out.println("Compiling and executing C code.");

	}

}
