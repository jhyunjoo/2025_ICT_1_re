package ch10_re;

public class _01_Company {
	
	private static _01_Company company = new _01_Company();
	
	private _01_Company() {
		System.out.println("디폴트 생성자");
	}
	
	public static _01_Company getCompany() {
		if(company == null) {
			company = new _01_Company();
		}
		return company;
	}
	
	public void gotoWork(String worker) {
		System.out.println(worker + "이(가) 출근하다.");
	}
	
	public void work(String worker) {
		System.out.println(worker + "이(가) 일하다.");
	}
	
	public void gotoCafeteria(String worker) {
		System.out.println(worker + "이(가) 점심먹다.");
	}
	
	public void gotoHome(String worker) {
		System.out.println(worker + "이(가) 퇴근하다.");
	}
	
	final public void company(String worker) {
		gotoWork(worker);
		work(worker);
		gotoCafeteria(worker);
		gotoHome(worker);
	}

	
}
