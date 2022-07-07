package study.jparest.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class StoryBook {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int bookId;
	@Column
	private String bookName;
	@Column
	private String publisher;
	@Column
	private int cost;
	
	@OneToMany(mappedBy="book", cascade = CascadeType.ALL)
	private List<Story> stories;
	
	public List<Story> getStories() {
		return stories;
	}
	
	
	public void setStories(List<Story> stories) {
		this.stories = stories;
	}
	
	
	public StoryBook() {}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}
}
