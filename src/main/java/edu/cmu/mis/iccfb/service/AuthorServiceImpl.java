package edu.cmu.mis.iccfb.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cmu.mis.iccfb.model.Author;

public class AuthorServiceImpl implements AuthorServiceCustom {

	@Autowired
    private AuthorService authorService;
	
	public Author getAllQuotes(String name) {
		Author author = new Author(name);
		
		return author;
	}
	
}
