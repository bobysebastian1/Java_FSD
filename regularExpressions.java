package Module1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpressions {

	public static void main(String[] args) {
		  
		String pattern = "[A-Z]+";
		String check = "HeLlOhOwA re YOu?";

		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
		}

    




	}


