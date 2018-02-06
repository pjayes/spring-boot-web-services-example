package com.pjayes.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<TodoType> fetchAll() {
        return todoRepository.fetchAll();
    }

    public void add(TodoType todo) {
        todo.setUid(UUID.randomUUID().toString());
        todoRepository.add(todo);
    }

    public void delete(String uid) {
        todoRepository.delete(uid);
    }

    public void markAsCompleted(String uid) {
        TodoType todo = get(uid);
        todo.setCompleted(true);
    }

    public TodoType get(String uid) {
        return todoRepository.get(uid).orElseThrow(() -> new RuntimeException("Invalid uid"));
    }

}
