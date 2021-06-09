package ch.sabina.dp.flyweight;

public class TestFlyweight {
	public static void testFlyweight() {
		Code code = new Code("C Code...");		
		Platform platform = PlatformFactory.getPlatformInstance("C");
		platform.executeCode(code);
		System.out.println("*************************");
		
		code = new Code("C Code2...");
		platform = PlatformFactory.getPlatformInstance("C");
		platform.executeCode(code);
		System.out.println("*************************");
		
		code = new Code("JAVA Code...");
		platform = PlatformFactory.getPlatformInstance("JAVA");
		platform.executeCode(code);
		System.out.println("*************************");
		
		code = new Code("JAVA Code2...");		
		platform = PlatformFactory.getPlatformInstance("JAVA");
		platform.executeCode(code);
		System.out.println("*************************");
		
		code = new Code("RUBY Code...");		
		platform = PlatformFactory.getPlatformInstance("RUBY");
		platform.executeCode(code);
		System.out.println("*************************");
		
		code = new Code("RUBY Code2...");		
		platform = PlatformFactory.getPlatformInstance("RUBY");
		platform.executeCode(code);
	}

}
