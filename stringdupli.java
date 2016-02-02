
import java.util.HashMap;

import java.util.Scanner;





public class stringdupli {



public static boolean dupli(String s1)

{

int i,val;

boolean c[]=new boolean[256];

for(i=0;i<s1.length();i++)

{

val=s1.charAt(i);

if(c[val])

return false;

c[val]=true;

}

return true;

}


public static boolean  checkpremu(String s1,String s2)

{

int i;

int []a=new int[256];

if(s1.length()!=s2.length())

return false;

for(i=0;i<s1.length();i++)

{

a[s1.charAt(i)]+=1;

a[s2.charAt(i)]-=1;


}

for(i=0;i<s2.length();i++)

{

if(a[s1.charAt(i)]!=0 || a[s2.charAt(i)]!=0)

return false;

}

return true;


}



public static void main(String[] args) {

// TODO Auto-generated method stub


Scanner sc=new Scanner(System.in);

String s1=sc.next();

//	System.out.println(dupli(s1));




  String s2=sc.next();

  System.out.println(checkpremu(s1,s2));



}





}