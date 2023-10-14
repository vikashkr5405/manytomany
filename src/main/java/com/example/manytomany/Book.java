package com.example.manytomany;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity(name="book")
public class Book {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String book_name;

 @JsonIgnore
 @ManyToMany(cascade=CascadeType.ALL)
 List<Publisher> publisher;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBook_name() {
	return book_name;
}

public void setBook_name(String book_name) {
	this.book_name = book_name;
}

public List<Publisher> getPublisher() {
	return publisher;
}

public void setPublisher(List<Publisher> publisher) {
	this.publisher = publisher;
}


}
