package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Book;

public interface BookDao {
	//use the ID query books
	Book queryById(long id);
	//find all books  from offset , limit is the total number
	List<Book> queryAll (@Param("offset") int offset,@Param("limit") int limit);
	//reduce the book number
	int reduceNumber (Long bookId);
	
}
