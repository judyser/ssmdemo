package test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import dao.BookDao;
import entity.Book;

public class BookDaoTest extends BaseTest {
	@Autowired
	private BookDao bookDao;
	@Test
	public void testQueryById() throws Exception{
		long bookId = 1000;
		Book book = bookDao.queryById(bookId);
		System.out.println(book);
	}
}
