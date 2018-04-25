package com.codeonblue.workshopmongo.repository;

import com.codeonblue.workshopmongo.domain.Post;
import com.codeonblue.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
