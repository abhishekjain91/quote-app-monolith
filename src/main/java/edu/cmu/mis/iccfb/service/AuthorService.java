package edu.cmu.mis.iccfb.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import edu.cmu.mis.iccfb.model.Author;

@Service
public interface AuthorService extends CrudRepository<Author, Long> {

    Author findByName(String name);
    
    // Create this method to get all quotes
    //Author getAllQuotes(String name);
}
