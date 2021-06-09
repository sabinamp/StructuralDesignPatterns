package ch.sabina.dp.flyweight;

/*
 * flyweight is a shared object that can be used in multiple contexts simultaneously. The flyweight acts as an independent object in
each context - it’s indistinguishable from an instance of the object that’s not shared. Flyweights cannot make assumptions about
the context in which they operate. The key concept here is the distinction between intrinsic and extrinsic state. Intrinsic state is
stored in the flyweight; it consists of information that’s independent of the flyweight’s context, thereby making it sharable. The
extrinsic state depends on and varies with the flyweight’s context and therefore can’t be shared. Client objects are responsible
for passing extrinsic state to the flyweight when it needs it
 */
public class JavaPlatform implements Platform {

	@Override
	public void executeCode(Code code) {
		
			System.out.println("Compiling and executing Java code.");

	}

}
