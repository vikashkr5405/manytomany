package com.example.manytomany;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

	@Query("select b from book b where b.id=?1" )
	List<Book> getById(int id);
	
	//@Query("select b from book b join b.publisher p where b.name like %?1%")
	//join query not working//List<Book> findByName(String name);
}
