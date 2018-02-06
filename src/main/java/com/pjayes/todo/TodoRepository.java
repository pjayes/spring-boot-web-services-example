package com.pjayes.todo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TodoRepository {

    private List<TodoType> todos;

    public TodoRepository() {
        todos = new ArrayList<>();
    }

    public List<TodoType> fetchAll() {
        return todos;
    }

    public void add(TodoType todo) {
        todos.add(todo);
    }

    public void delete(String uid) {
        todos.stream().filter(td -> td.getUid().equals(uid)).findFirst().ifPresent(td -> todos.remove(td));
    }

    public Optional<TodoType> get(String uid) {
        return todos.stream().filter(td -> td.uid.equals(uid)).findFirst();
    }

}
