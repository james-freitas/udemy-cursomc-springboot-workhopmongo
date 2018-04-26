package com.codeonblue.workshopmongo.services;

import com.codeonblue.workshopmongo.domain.Post;
import com.codeonblue.workshopmongo.repository.PostRepository;
import com.codeonblue.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> findAll(){
        return postRepository.findAll();
    }

    public Post findById(String id){
        Optional<Post> post = postRepository.findById(id);
        if (!post.isPresent()){
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return post.get();
    }

    public List<Post> findByTitle(String text) {
        return postRepository.findByTitleContainingIgnoreCase(text);
    }

}
