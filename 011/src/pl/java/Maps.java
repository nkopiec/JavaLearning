package pl.java;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Maps {
	public static void main(String[] args) throws IOException {
		HashMap<String, String> map = new HashMap<>();
		
		Scanner scanner = new Scanner(new File("firmsAddr.txt"));
		String firmName;
		String address;
		while(scanner.hasNextLine()) {
			firmName = scanner.nextLine();
			address = scanner.nextLine();
		map.put(firmName, address);
		while ((firmName = showInputDialog("Firm name")) != null) {
			address = map.get(firmName);
			if(address == null) address = "There isn't this firms";
			showMessageDialog(null, "Firma: " + firmName + '\n' + "Adres" + address);
		}
		}
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for(String name : map.keySet() ) {
			String addr = map.get(name);
			System.out.println(name + " - addres: " + addr );
		}
	}

	private static void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}

	private static String showInputDialog(String string) {
		// TODO Auto-generated method stub
	 	return null;
	}

}
