package regexproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
	 	 	     	
	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		/*
		 * Parser parser = new Parser("[Ii].","I1");
		 * System.out.println(parser.checkInpString());
		 */	
		
		Parser parser2 = new Parser("[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+\\.[\\w]{1,3}","ff@ya.ru");		
		Printer printer = new Printer("Консольный принтер", parser2);
		printer.print();
		
		System.out.println(Parser.checkInpString("[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+\\.[\\w]{1,3}","ff@ya.ru"));
		
		Printer.print(parser2);
		Printer.print(printer);
		
	}
}