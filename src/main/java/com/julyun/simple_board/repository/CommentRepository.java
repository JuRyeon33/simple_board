package com.julyun.simple_board.repository;

import com.julyun.simple_board.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}