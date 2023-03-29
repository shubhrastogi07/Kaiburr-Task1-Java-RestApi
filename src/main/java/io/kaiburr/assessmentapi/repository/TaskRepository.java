package io.kaiburr.assessmentapi.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import io.kaiburr.assessmentapi.model.Task;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task,String> {

    //List<Task> findBySeverity(int severity);

    @Query("{ name: ?0 }")
    List<Task> getTasksByname(String name);
}


	

