package takeyouforward;

public class PatternNi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int star=2;
		int space=7;

		for(int i=1;i<=9;i++) {


			if(i>1 & i<=4) {
				star=star+2;
				space=space-2;

			}

			else if(i==5) {
				star = star + 2;
				space=0;
			}
			else {
				space = space + 2;
				star = star - 2;

			}

			for(int str = 1;str<=star/2;str++) {

				System.out.print("*");
			}

			for(int sp=1;sp<=space;sp++) {

				System.out.print(" ");
			}

			for(int st = (star/2)+1;st<=star;st++) {

				System.out.print("*");
			}

			System.out.println();

		}

	}

}
