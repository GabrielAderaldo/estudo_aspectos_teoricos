package estudoAspectosTeoricos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
	try {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter a statement:");
	    String input = reader.readLine();

	    Compilador parser = new Compilador(new java.io.StringReader(input));
	    int result = parser.program();
	    System.out.println("Result: " + result);
	} catch (ParseException e) {
	    System.err.println("Parsing failed: " + e.getMessage());
	} catch (Exception e) {
	    System.err.println("Error: " + e.getMessage());
	}
    }
}