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
		 FileReader fileReader = null;
	        try {
	            fileReader = new FileReader(this.leFchier);
	            
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
		while( fileReader.read() != -1)
		{
			char lechar = (char)fileReader.read();
			if(map.containsKey(lechar))
			{
				map.put(lechar, map.get(lechar)+1);
			}
			else
			{
				map.put(lechar, 1);
			}
		}
		
			return this.map;
		
	}
	
	
}
