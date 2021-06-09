package ch.sabina.dp;

import ch.sabina.dp.bridge.TestBridgePattern;
import ch.sabina.dp.flyweight.TestFlyweight;
import ch.sabina.dp.proxy.protection.TestProtectionProxy;
import ch.sabina.dp.proxy.remote.ReportGeneratorClient;

public class MainClass {
	
	public static void main(String[] args) {
		//TestBridgePattern.testBridge();
		//ReportGeneratorClient.printResult();
		//TestProtectionProxy.testProtectionProxy();
		TestFlyweight.testFlyweight();
	}
	
}
