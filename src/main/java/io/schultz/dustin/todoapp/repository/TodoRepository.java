package io.schultz.dustin.todoapp.repository;

import io.schultz.dustin.todoapp.model.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoList, Long> {

}
