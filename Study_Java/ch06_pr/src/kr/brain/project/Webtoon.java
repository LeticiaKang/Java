package kr.brain.project;

import java.time.LocalDateTime;
import java.util.Objects;

// ������ ����ϰ� ��ȸ�ϴ� �� �غ��ž�
// ������ �ֿ� �ʵ�� ����? (����, ����, �帣, �Ǹźν�)

// ���� Book����
// �������̽��� BOOk�� ��������
public class Webtoon implements Book {

	private String isbn;
	private String genre;
	private String author;
	private String title;
	private LocalDateTime date;
	private int count;
	
	public Webtoon() {
	}
	
	public Webtoon(String isbn, String title, String genre, String author) {
		this.isbn = isbn;
		this.title = title;
		this.genre = genre;
		this.author = author;
		date = LocalDateTime.now(); 
	}
	
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	// ������
	public String toString() {
		return "Webtoon [title = " + title + ", genre = " + genre +  ", author = " + author + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // �����ϴ� ��ü�� ������ true
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Webtoon other = (Webtoon) obj;
		return Objects.equals(author, other.author) 
				&& Objects.equals(date, other.date)
				&& Objects.equals(genre, other.genre) 
				&& Objects.equals(title, other.title);
	}

	
	@Override
	public void setGerne(String genre) {
	}

	
	
	
	
}