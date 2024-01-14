package com.Post_1.Post_1.repository;


import com.Post_1.Post_1.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, String> {
}
