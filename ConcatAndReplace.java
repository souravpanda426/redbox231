package mypackage;

public class ConcatAndReplace {

	public static void main(String[] args) {
		
		
		String x = "java programming";
		String concat = x.concat(" and python ");
		System.out.println(concat);
		String replaceAll = concat.replaceAll("java", "C+");
		System.out.println(replaceAll);
	}

}
