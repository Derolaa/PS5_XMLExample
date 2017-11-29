package pkgEmpty;

import static org.junit.Assert.*;

import java.util.ArrayList;

import pkgException.BookException;
import pkgLibrary.Book;
import pkgLibrary.Catalog;

public class Tests {
	@org.junit.Test (expected = BookException.class)
	public void getBooktest() throws BookException {

		Book b1 = new Book();

		Book b2 = new Book();

		b1.setId("1");

		b2.setId("2");

		ArrayList<Book> books = new ArrayList<Book>();

		books.add(b1);

		books.add(b2);

		

		Catalog cat = new Catalog();

		cat.setBooks(books);

		assertEquals(cat.getBook("1"),b1);

		assertEquals(cat.getBook("2"), b2);

		cat.getBook("3");

	}



	@org.junit.Test (expected = BookException.class)

	public void addBooktest() throws BookException{

		Book b1 = new Book();

		Book b2 = new Book();

		Book b3 = new Book();

		Book b4 = new Book();

		b1.setId("1");

		b2.setId("2");

		b3.setId("3");

		b4.setId("4");

		ArrayList<Book> books = new ArrayList<Book>();

		books.add(b1);

		books.add(b2);

		books.add(b3);

		

		Catalog cat = new Catalog();

		cat.setBooks(books);

		cat.addBook(0, b1);

		

		cat.addBook(0, b4);

		books.add(b4);

		assertEquals(cat.getBooks(), books);

	}

}
