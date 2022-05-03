package com.revature.pnwgolf.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.revature.pnwgolf.models.Course;

public interface CourseDao extends CrudRepository<Course, String> {

	@Query(nativeQuery=true, value="SELECT * FROM courses WHERE state :state")
	List<Course> findCourseByState();
	
	Optional<Course> findCourseByCourseName(String courseName);
}
