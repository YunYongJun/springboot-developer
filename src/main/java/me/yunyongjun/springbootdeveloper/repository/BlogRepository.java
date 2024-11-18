package me.yunyongjun.springbootdeveloper.repository;

import me.yunyongjun.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
