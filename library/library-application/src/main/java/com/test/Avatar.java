package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Avatar {
	public static Scanner sc = new Scanner(System.in);
	public static LibraryDAO libraryDAO = new LibraryDAO();
	
	public static void main(String[] args) {
		String userInput;
		do {
			System.out.println("What do you want do?");
			System.out.println("Add book-> enter 1");
			System.out.println("Show all book-> enter 2");
			System.out.println("Exit-> enter x");
			userInput = getUserInput();
			if (userInput.equals("1")) {
				addBook();
			} else if (userInput.equals("2")) {
				showBooks();
			}
		} while (!userInput.equalsIgnoreCase("x"));
	}
	
	private static void addBook() {
		System.out.println("Add new book into our library. ");
		Book book = new Book();
		System.out.println("Input title of book: ");
		book.setTitle(getUserInput());
		
		System.out.println("Input issue of book: ");
		book.setIssue(getUserInput());
		
		System.out.println("Input autor name of book: ");
		book.setAuthor(getUserInput());
		
		Pattern formuleData = Pattern.compile("[0-9]{4}.[0-1]?[0-9].[0-3]?[0-9]");
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy.MM.dd");
		String dataInput;
		do {
			System.out.println("Input date od publication (in yyyy.mm.dd format): ");
			dataInput = getUserInput();
			if (formuleData.matcher(dataInput).matches()) {
				try {
					book.setDateOfPublication(sdf.parse(dataInput));
				} catch (ParseException pe) {
					System.err.println("You did wrong date, try again!");
				}
			}
		} while (book.getDateOfPublication()==null);
	}
	
	private static void showBooks() {
		System.out.println("We have in our library this books: ");
		
		Book book;
		for (int i = 0; i < libraryDAO.getBooks().size(); i++) {
			book = libraryDAO.getBooks().get(i);
			System.out.println(i + book.getTitle());
		}
		Pattern formulaBook = Pattern.compile("[0-9]+");
		String bookInput;
		do {
			System.out.println("Which book want you show? ");
			bookInput = getUserInput();
		} while (!formulaBook.matcher(bookInput).matches());
		
		Integer bookNr = Integer.parseInt(bookInput);
		if (libraryDAO.getBooks().size()>bookNr) {
			Book chooseBook = libraryDAO.getBooks().get(bookNr);
			System.out.println("You choose: " + chooseBook.getTitle() + "  " + chooseBook.getAuthor() + "  "
			+  "  " + chooseBook.getIssue());
		} else {
			System.out.println("We haven't got this book, try looking other or add new! ");
		}
	}
	
	public static String getUserInput() {
		return sc.nextLine().trim();
	}
}
