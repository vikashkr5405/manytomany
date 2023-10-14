package com.example.manytomany;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
@Autowired
BookRepository brepo;

@Autowired
PublisherRepository prepo;

@RequestMapping("/saved")
public String save()
{
	Book b=new Book();
	b.setBook_name("The guide");
	Book b1=new Book();
	b1.setBook_name("untouchable");
	
    List<Book> list=Arrays.asList(b,b1);
    
	Publisher p=new Publisher();
	p.setPublisher_name("viking press");
	Publisher p1=new Publisher();
	p1.setPublisher_name("wishart books");

	p.setBook(list);
	p1.setBook(list);
	
	List<Publisher> plist=Arrays.asList(p,p1);
	b.setPublisher(plist);
	b1.setPublisher(plist);
	
	
	brepo.save(b);
	return "data saved..................................................!";
}
@RequestMapping("/findall")
public List<Book> aj()
{
	return brepo.findAll();
}
@RequestMapping("/find")
public List<Publisher> ajk()
{
	return prepo.findAll();
}
@RequestMapping("/by/{id}")
public List<Book> by(@PathVariable int id)
{
	return brepo.getById(id);
}
}
