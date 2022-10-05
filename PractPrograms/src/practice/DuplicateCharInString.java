package practice;
import java.util.HashMap;
import java.util.Set;

public class DuplicateCharInString {
	
	public static void main(String[] args) {
		String s = "fjsohhsgoweghsjdfjsjgdljgsdjljsadfj";
		char[] a = s.toCharArray();
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		for(char str:a) {
			if(hmap.containsKey(str))
				hmap.put(str, hmap.get(str)+1);
			else
				hmap.put(str, 1);
		}
		Set<Character> set = hmap.keySet();
		for(char key:set)
			if(hmap.get(key)>1)
				System.out.print(key +":" + hmap.get(key)+" ");				
			
	}

}
