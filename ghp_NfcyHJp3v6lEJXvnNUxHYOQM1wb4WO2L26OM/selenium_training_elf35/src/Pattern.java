
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=5;i++) {
	for(int j=1;j<=5;j++) {
		if(i+j>=6) {
			System.out.print(" "+"*");
		}else {
			System.out.print(" ");
		}
	}
	System.out.println("");
}
	for(int k=1;k<=6;k++) {
		for(int l=1;l<=6;l++) {
			if(l>=k+1) {
				System.out.print("*"+" ");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println("");
		}
		}
	}

