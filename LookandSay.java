
public class LookandSay {
	
	public static String lookandsay(String number)
	{
		StringBuilder result= new StringBuilder();
	 
		char repeat= number.charAt(0);
		number= number.substring(1) + " ";
		//System.out.println(repeat+" have no "+number);
		int times= 1;
	 
		for(char actual: number.toCharArray()){
			if(actual != repeat){
				result.append(times + "" + repeat);
				times= 1;
				repeat= actual;
			}else{
				times+= 1;
			}
		}
		return result.toString();
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "1"; 
		 
		for (int i=1;i<=10;i++) {
			System.out.println(num);
			num = lookandsay(num);
			if(i==1)
				System.out.println(num);
		}
		

	}

}
