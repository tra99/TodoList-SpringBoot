package tp05.gic.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tp05.gic.todo.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByTitle(String title);
}

