package pl.java;

public class Inicialization {
	private String notTransparentInitString;
	private String transparentInitString = "text";
	
	private int notTransparentInt;
	private int transparentInt = 5;
	
	private double notTransparentDouble;
	private double transparentDouble = 5.5;
	
	private boolean notTransparentBoolean;
	private boolean transparentBoolean = true;
	
	private static String staticString = Constraints.getString();
	private String nonStaticString = Constraints.getString();
	
	static {
		System.out.println("Static singleton");
	}
	
	{
		System.out.println("Non static singleton");
	}
	
	{
		String domain = Constraints.DOMAIN;
		String[] strings = domain.split("\\.");
		String firstWord = strings[0];
		notTransparentInitString = firstWord;
	}
	
	public Inicialization() {
		System.out.println("Not transparent String: " + notTransparentInitString);
		System.out.println("Transparent String: " + transparentInitString);
		
		System.out.println("Not transparent Int: " + notTransparentInt);
		System.out.println("Transparent Int: " + transparentInt);
		
		System.out.println("Not transparent double: " + notTransparentDouble);
		System.out.println("Transparent double: " + transparentDouble);
		
		System.out.println("Not transparent boolean: " + notTransparentBoolean);
		System.out.println("Transparent boolean: " + transparentBoolean);
	}
}
