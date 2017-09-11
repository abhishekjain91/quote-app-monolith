package edu.cmu.mis.iccfb.controller;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.cmu.mis.iccfb.model.Author;
//import edu.cmu.mis.iccfb.model.Quote;
import edu.cmu.mis.iccfb.service.AuthorService;
//import edu.cmu.mis.iccfb.service.QuoteService;

import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;
    
    @RequestMapping("/api/author")
    public Iterable<Author> getAuthors() {
    	System.out.println("hello123");
    	Iterable<Author> authors = this.authorService.findAll();
    	return authors;
    }
    
    @RequestMapping("/api/author/{id}")
	public Author getAuthor(@PathVariable("id") long id) {
    	System.out.println("hello");
    	Author author = this.authorService.findOne(id);
		return author;
	}
}
