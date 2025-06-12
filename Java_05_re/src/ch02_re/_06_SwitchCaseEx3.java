package ch02_re;

public class _06_SwitchCaseEx3 {

	public static void main(String[] args) {
		
		int score = 99;
		char grade = 'A';
		
		switch(score/10) {
			case 10:
				if(score == 100) {
					grade = 'A';
				} else {
					grade = 'W';
				}
			case 9:
				grade = 'B';
				break;
			case 8:
				grade = 'C';
				break;
			case 7:
				grade = 'D';
				break;
			case 6:
				grade = 'E';
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0: 
				grade = 'F';
				break;
			default: grade = 'W';
			break;
		}
		
		System.out.println("점수 : " + score + ", 학점 : " + grade);
		
	}
}
