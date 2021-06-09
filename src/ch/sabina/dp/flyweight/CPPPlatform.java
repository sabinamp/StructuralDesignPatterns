package ch.sabina.dp.flyweight;

public class CPPPlatform implements Platform {

	@Override
	public void executeCode(Code code) {

		System.out.println("Compiling and executing C++ code.");
	}

}
