import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;



public class CharCount {

	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	
	String leFchier;
	
	public CharCount(String leFichier)
	{
		this.leFchier = leFichier;
		
	}
	public HashMap<Character , Integer> lecture() throws IOException
	{
		BufferedReader fileReader = null;
		 String ligne;
	        try {
	            fileReader = new BufferedReader(new FileReader(this.leFchier));
	        
	            
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	       // int i = 1;
		while((ligne = fileReader.readLine()) != null)
		{
			for(int i = 0; i<ligne.length(); i++)
			{
				char c = ligne.charAt(i);
				if(map.containsKey(c))
				{
					map.put(c, map.get(c)+1);
				}
				else
				{
					map.put(c, 1);
				}
			}
		}
		
			return this.map;
		
	}
	
	
}
