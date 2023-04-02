package study.jparest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Story {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int storyId;
	@Column
	private String storyName;
	@Column
	private String author;
	
	@ManyToOne
	private StoryBook book;
	
	public StoryBook getBook() {
		return book;
	}
	
	public void setBook(StoryBook book) {
		this.book = book;
	}

	public Story() {}


	public int getStoryId() {
		return storyId;
	}


	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}


	public String getStoryName() {
		return storyName;
	}


	public void setStoryName(String storyName) {
		this.storyName = storyName;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
}
