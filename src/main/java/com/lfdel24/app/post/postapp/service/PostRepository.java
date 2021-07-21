package com.lfdel24.app.post.postapp.service;

import com.lfdel24.app.post.postapp.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author leo
 */
@Service
public interface PostRepository extends JpaRepository<Post, Long> {

}
