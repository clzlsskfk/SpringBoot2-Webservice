package com.achi.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC") //Posts의 p의 id를 내림차순 하여 p 를 선택 << 이게 맞나??
    List<Posts> findAllDesc();

}