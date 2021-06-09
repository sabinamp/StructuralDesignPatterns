package ch.sabina.dp;

import ch.sabina.dp.bridge.TestBridgePattern;
import ch.sabina.dp.proxy.remote.ReportGeneratorClient;

public class MainClass {
	
	public static void main(String[] args) {
		//TestBridgePattern.testBridge();
		ReportGeneratorClient.printResult();
	}
	
}
