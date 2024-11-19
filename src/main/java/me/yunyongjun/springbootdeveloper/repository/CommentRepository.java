package me.yunyongjun.springbootdeveloper.repository;

import me.yunyongjun.springbootdeveloper.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
