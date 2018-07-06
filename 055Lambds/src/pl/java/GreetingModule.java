package pl.java;

import java.awt.EventQueue;

public interface GreetingModule {
	 

	public static Object run() {
		Object args = null;
   EventQueue.invokeLater(() -> { startGUI(args); });
return args;
	}

	static void startGUI(Object args) {
	}
	
	
}