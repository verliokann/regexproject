package regexproject;

public class Printer {
    private String name;
    private Parser parser;
    	   
    public Printer(String name, Parser parser) {
		super();
		this.name = name;
		this.parser = parser;
	}

	public void print() {
    	System.out.println(parser.checkInpString());
    }
	
	public static void  print(Object o) {
		System.out.println(o);
	}

	@Override
	public String toString() {
		return "Printer [name=" + name + ", parser=" + parser + "]";
	}   
}
