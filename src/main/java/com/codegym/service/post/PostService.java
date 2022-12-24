package com.codegym.service.post;

import com.codegym.model.Post;
import com.codegym.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService {

    @Autowired
    private IPostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public boolean save(Post post) {
        try {
            if (post == null) {
                throw new Exception("Post is null");
            }
            postRepository.save(post);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        try {
            Post post = postRepository.findById(id).orElse(null);
            if (post == null) {
                throw new Exception("Post is null");
            }
            postRepository.delete(post);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Post findById(Long id) {
        return postRepository.findById(id).orElse(null);
    }
}