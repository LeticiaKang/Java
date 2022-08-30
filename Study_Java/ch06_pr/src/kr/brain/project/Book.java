package kr.brain.project;

public interface Book{
	
	String getTitle(); //제목을 가져와야해
	void setTitle(String title); //추상메소드 생성
	
	String getGenre();
	void setGerne(String genre);
	
	String getAuthor();
	void setAuthor(String author);
	
	
}
