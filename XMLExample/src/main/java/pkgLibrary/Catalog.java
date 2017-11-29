package pkgLibrary;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import pkgException.BookException;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	@XmlAttribute
	int id;	
	
	@XmlElement(name="book")
	ArrayList<Book> books;
	
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public Book getBook(String BookID) throws BookException {
		for (Book b : this.getBooks()) {
			if (b.getId() == BookID) {
				return b;
			}
			else {
				throw new BookException();
			}
}
		return null;
	}
	
	public void addBook(int ID, Book bk) throws BookException {
		for (Book b : this.getBooks()) {
		if(bk.getId() == b.getId()) {
			throw new BookException();
		}
		else {
			this.getBooks().add(b);
		}
		
		}
	}
}