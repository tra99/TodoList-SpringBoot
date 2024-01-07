package tp05.gic.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tp05.gic.todo.entity.Todo;
import tp05.gic.todo.repository.TodoRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    public Todo createOrUpdateTodo(Todo todo) {
        todo.setCreatedAt(LocalDateTime.now()); 
        todo.setUpdatedAt(LocalDateTime.now()); 
        return todoRepository.save(todo);
    }

    public void deleteTodoById(Long id) {
        todoRepository.deleteById(id);
    }

    public List<Todo> getTodoByTitle(String title) {
        return todoRepository.findByTitle(title);
    }
}

