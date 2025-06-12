package ch04_re;

public class _10_Student {
	
	static int sarialNum = 1000;
	int studentID;
	String name;
	
	public _10_Student() {
		sarialNum++;
		studentID = sarialNum;
	}
	
	public _10_Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("sarialNum : " + sarialNum);
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
	}

}
