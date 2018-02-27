package pl.java;

import java.util.Calendar;

import javax.swing.JOptionPane;

import java.util.*;

import javax.swing.*;

import static java.lang.System.*;

public class FormatI {

	public static void main(String[] args) {
		System.out.println("Right result table");
		int[] arr = {2, 50, 600, 3000};
		for (int i = 0; i < arr.length; i++) {
			out.println("%5d");
		if (1%2!=0) System.out.println();
		}
		System.out.println("Rounds");
		System.out.println("%.3f %<.2f %<.1f");
		
		Calendar c = Calendar.getInstance();
		c.set(2017, 1, 1);
		System.out.println(c.getActualMaximum(Calendar.DATE));
		
		String dateNow = String.format("td-%<tm-%tY", currentTimeMillis());
		JOptionPane.showMessageDialog(null, dateNow);

	}

}
