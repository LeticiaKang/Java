package board;

import java.util.Date;

// 이 파일은 "게시글 정보를 담을 수 있는 클래스"이다. 

// 게시글 구성은 아래와 같으며 앞서서 오라클을 이용해 table을 생성한 상태에서 작업한다. 
// "NUM", "TITLE", "WRITER", "CONTENT", "REGDATE", "CNT" 

// 1. 테이블 컬럼명과 동일하기 변수 선언하기
// 2. 게터 세터 생성하기
// 3. 투스트링 생성하기
// 4. 생성자, 기본생성자 만들기 - 순수하게 값을 저장하기 위한 용도

// 이제 데이터 베이스에 접근하는 클래스를 만들어보자!

public class BoardVo {
	private int num;
	private String title;
	private String  writer;
	private String  content;
	private Date regdate;
	private int cnt;
	
	// 기본 생성자
	public BoardVo() {}
	
	// 생성자
	public BoardVo(int num, String title, String writer, String content, Date regdate, int cnt) {
		super();
		this.num = num;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regdate = regdate;
		this.cnt = cnt;
	}	
	
	// getter/ setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	// tostring
	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regdate="
				+ regdate + ", cnt=" + cnt + "]";
	}
	
	
}
