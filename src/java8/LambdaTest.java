package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LambdaTest {

	public LambdaTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	/*public static String query(String question) {
		  List<String> engines = new ArrayList<String>();
		  engines.add("http://www.google.com/?q=");
		  engines.add("http://duckduckgo.com/?q=");
		  engines.add("http://www.bing.com/search?q=");
		   
		  // get element as soon as it is available
		  Optional<String> result = engines.stream().parallel().map((base) - {
		    String url = base + question;
		    // open connection and fetch the result
		    return WS.url(url).get();
		  }).findAny();
		  return result.get();
		}*/

}
