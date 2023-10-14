package com.example.manytomany;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity(name="publisher")
public class Publisher {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String publisher_name;

@JsonIgnore
@ManyToMany(cascade=CascadeType.ALL,mappedBy="publisher")
List<Book> book;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPublisher_name() {
	return publisher_name;
}

public void setPublisher_name(String publisher_name) {
	this.publisher_name = publisher_name;
}

public List<Book> getBook() {
	return book;
}

public void setBook(List<Book> book) {
	this.book = book;
}


}
