import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			HashMap<Character, Integer> count = new CharCount("fichier.txt").lecture();
					
					for(Entry<Character, Integer> entry : count.entrySet()) 
					{
					 System.out.println(entry.getKey() + " : " + entry.getValue());
					}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
