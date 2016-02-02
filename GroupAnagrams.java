import java.util.*;

public class GroupAnagrams {
	public static void main(String[] args){
		String[] arrwords = {"art","tar","top","pot","neat","rat","tape","nate","peat","random"};
		String[] srtdarrwords = sortAlphabetsInEachWord(arrwords);
		/*for(int i=0;i<srtdarrwords.length;i++)
			System.out.println(srtdarrwords[i]);
		System.out.println();*/
		HashMap<String, String> wordmap = new HashMap<String,String>();
		int i=0;
		for(String s : srtdarrwords){
			System.out.println(s);
			if(wordmap.containsKey(s)){
				wordmap.put(s,wordmap.get(s)+","+arrwords[i++]);
				System.out.println("already contains, so adding");
				System.out.println(wordmap.get(s));
			}
			else{
				wordmap.put(s,arrwords[i++]);
			}
		}
		for(String s : wordmap.keySet()){
			System.out.println("["+wordmap.get(s)+"]");
		}
		
	}
	private static String[] sortAlphabetsInEachWord(String[] inparr){
		String[] retstr = new String[inparr.length];
		int i=0;
		for (String s : inparr){
			retstr[i++] = s;
		}
		i=0;
		for (String s : retstr){
			char[] alphword = s.toCharArray();
			Arrays.sort(alphword);
			s = new String(alphword);
			retstr[i++] = s;
		}
		
		return retstr;
	}

}