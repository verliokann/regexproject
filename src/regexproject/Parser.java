package regexproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser{	
    private String patternStr;
    private String inpStr;
               
    public Parser() {}

    public Parser(String patternStr, String inpStr) {
		this.patternStr = patternStr;
		this.inpStr = inpStr;
	}

	public boolean checkInpString(){
	      Pattern p = Pattern.compile(patternStr); // סמחהאול ןנאגטכא         
	      Matcher m = p.matcher(inpStr); 
	      return m.matches();
    }

	public static boolean checkInpString(String patternStr, String inpStr){
	      Pattern p = Pattern.compile(patternStr); // סמחהאול ןנאגטכא         
	      Matcher m = p.matcher(inpStr); 
	      return m.matches();
    }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((inpStr == null) ? 0 : inpStr.hashCode());
		result = prime * result + ((patternStr == null) ? 0 : patternStr.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parser other = (Parser) obj;
		if (inpStr == null) {
			if (other.inpStr != null)
				return false;
		} else if (!inpStr.equals(other.inpStr))
			return false;
		if (patternStr == null) {
			if (other.patternStr != null)
				return false;
		} else if (!patternStr.equals(other.patternStr))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Parser [patternStr=" + patternStr + ", inpStr=" + inpStr + ", checkInpString()=" + checkInpString()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}

}
