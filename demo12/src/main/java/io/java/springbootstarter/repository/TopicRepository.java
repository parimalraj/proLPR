package io.java.springbootstarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import io.java.springbootstarter.topic.Topic;

public interface TopicRepository extends JpaRepository<Topic, String>{
	
	@Query("SELECT p FROM table_name p WHERE p.order_id = :h")
	Topic findProjectByProjectName(@Param("column_name")String s1);

}
