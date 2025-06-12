package ch05_re;

public class _02_ArrayEx {
	
	public static void main(String[] args) {
		String[] food = {"순대국밥", "슈프림양념치킨", "떡볶이", "장어구이", "곱창"};
		
		for(int i = 0; i < food.length; i++) {
			System.out.println((i+1) + " : " + food[i]);
		}
		
		System.out.println();
		
		for(String f : food) {
			System.out.print(f + " ");
		}
	}

}
