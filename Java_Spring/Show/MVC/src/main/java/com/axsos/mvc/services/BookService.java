package com.axsos.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.mvc.repositories.BookRepository;
import com.axsos.mvc.models.Book;
@Service
public class BookService {
    private final BookRepository bookRepository;
	public BookService(BookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}
	//return all books
	public List<Book> allBooks() {
        return (List<Book>) bookRepository.findAll();
    }
	//create a book
	public Book createBook (Book b) {
		return bookRepository.save(b);
	}
	
	//retrieve book
	public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

	//update by id
	public Book updateBook(Long id, String title, String description, String language, int numberOfPages) {

		Book book = bookRepository.findById(id).orElse(null);
		book.setTitle(title);
		book.setDescription(description);
		book.setLanguage(language);
		book.setNumberOfPages(numberOfPages);

		
		return bookRepository.save(book);
	}
	
	//delete by id
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
		
	}


}