package study.jparest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import study.jparest.entity.Story;
import study.jparest.entity.StoryBook;
import study.jparest.repositary.StoryBookRepo;

@RestController
public class ManyToOneController {

	@Autowired
	StoryBookRepo repo;
	
	@PostMapping("/addstorybook")
	public void add()
	{
		StoryBook b = new StoryBook();
		b.setBookName("Lovely Stories");
		b.setCost(400);
		b.setPublisher("T & T books");
		
		List<Story> list = new ArrayList<Story>();
		
		Story s1= new Story();
		s1.setAuthor("AAA");
		s1.setStoryName("two foxes");
		s1.setBook(b);
		list.add(s1);
		
		Story s2= new Story();
		s2.setAuthor("BBB");
		s2.setStoryName("blue sky");
		s2.setBook(b);
		
		list.add(s2);
		
		b.setStories(list);
		
		repo.save(b);
		
	}
	
	@GetMapping("/show")
	public String get()
	{
		StoryBook b = repo.findById(1).get();
		
		return  b.getBookName()+"  "+b.getStories().get(0).getStoryName();
	}
	
	
	
}
