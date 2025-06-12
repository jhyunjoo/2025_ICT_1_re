package ch10_re;

public class _01_Main {
	
	public static void main(String[] args) {
		
		_01_Company yu = _01_Company.getCompany();
		yu.company("유하민");
		
		System.out.println();
		
		_01_Company chae = _01_Company.getCompany();
		chae.company("채봉구");
		
		System.out.println("------------------------------");
		System.out.println(yu == chae);
		System.out.println(yu);
		System.out.println(chae);
		
	}

}
