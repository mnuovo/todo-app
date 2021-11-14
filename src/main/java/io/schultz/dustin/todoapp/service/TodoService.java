package io.schultz.dustin.todoapp.service;

import io.schultz.dustin.todoapp.converter.TodoListConverter;
import io.schultz.dustin.todoapp.dto.TodoListDto;
import io.schultz.dustin.todoapp.repository.TodoRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

    private final TodoListConverter todoListConverter;
    private final TodoRepository todoRepository;

    @Inject
    public TodoService(TodoListConverter todoListConverter, TodoRepository todoRepository) {
        this.todoListConverter = todoListConverter;
        this.todoRepository = todoRepository;
    }

    public List<TodoListDto> getTodoLists() {
       return todoRepository.findAll().stream()
                .map(todoListConverter::convert)
                .collect(Collectors.toList());
    }
}
