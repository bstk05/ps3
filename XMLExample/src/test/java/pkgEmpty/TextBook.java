package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pkgLibrary.BookException;

import org.junit.Test;

import pkgLibrary.Book;
import pkgLibrary.Catalog;


public class TextBook {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestGetBook() throws BookException {
		Catalog i = new Catalog();
		i.setId(1);
		
		Book b1 = new Book();
		b1.setAuthor("Peter");
		b1.setDescription("Interesting stories of American history");
		b1.setTitle("DXM");
		
		i.AddBook(1, b1);
		i.GetBook(1);
		
	}
	
	@Test
	public void TestAddBook() throws BookException{
		Catalog i = new Catalog();
		i.setId(1);
		
		Book b1 = new Book();
		b1.setAuthor("Peter");
		b1.setDescription("Interesting stories of American history");
		b1.setTitle("DXM");
		
		i.AddBook(1,b1);
		assertEquals(1,i.getBooks().size());
		
	}

}
