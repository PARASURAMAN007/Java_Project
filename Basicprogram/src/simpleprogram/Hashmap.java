package simpleprogram;
import java.util.HashMap;
public class Hashmap {

	public static void main(String [] args) {
		HashMap<String,String> country = new HashMap<String,String>();
		country.put("india", "delhi");
		country.put("japan", "tokyo");
		country.put("england", "london");
		country.replace("india", "chennai");
		System.out.println(country);
		
	}
}
