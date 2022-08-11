
public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String s="Advanced Selenium";
//String rev=" ";
//for(int i=s.length()-1;i>=0;i--) {
	//rev=rev+s.charAt(i);
//}
//System.out.println(rev);
	//}
//}
String var="Advanced Selenium";
String rev=" ";
char[] carr=var.toCharArray();
for(int i=carr.length-1;i>=0;i--) {
	rev=rev+carr[i];
}
System.out.println(rev);
}
}

