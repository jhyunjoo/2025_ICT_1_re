package ch09_re;

public class _06_IDFormat {
	
	private String userId;
	
	public _06_IDFormat() {}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) throws _06_IDFormatException {
		if(userId == null) {
			throw new _06_IDFormatException("아이디는 null이 될 수 없습니다.");
		} else if(userId.length() < 8 || userId.length() > 20) {
			throw new _06_IDFormatException("아이디는 8자 이상, 20자 이하로 입력해주세요.");
		} else {
			this.userId = userId;
		}
	}

}
