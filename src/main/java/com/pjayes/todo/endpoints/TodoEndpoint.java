package com.pjayes.todo.endpoints;

import com.pjayes.todo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class TodoEndpoint {

    private static final String NAMESPACE_URI = "http://pjayes.com/todo";

    private TodoService todoService;

    @Autowired
    public TodoEndpoint(TodoService todoService) {
        this.todoService = todoService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetTodoRequest")
    @ResponsePayload
    public GetTodoResponse getTodos(@RequestPayload GetTodoRequest request) {
        GetTodoResponse res = new GetTodoResponse();
        res.getTodo().addAll(todoService.fetchAll());
        return res;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddTodoRequest")
    @ResponsePayload
    public GetTodoResponse addTodo(@RequestPayload AddTodoRequest request) {
        todoService.add(request.getTodo());
        GetTodoResponse res = new GetTodoResponse();
        res.getTodo().addAll(todoService.fetchAll());
        return res;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteTodoRequest")
    @ResponsePayload
    public GetTodoResponse deleteTodo(@RequestPayload DeleteTodoRequest deleteTodoRequest) {
        todoService.delete(deleteTodoRequest.getUid());
        GetTodoResponse res = new GetTodoResponse();
        res.getTodo().addAll(todoService.fetchAll());
        return res;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MarkAsCompletedRequest")
    @ResponsePayload
    public GetTodoResponse markAsCompleted(@RequestPayload MarkAsCompletedRequest markAsCompletedRequest) {
        todoService.markAsCompleted(markAsCompletedRequest.getUid());
        GetTodoResponse res = new GetTodoResponse();
        res.getTodo().addAll(todoService.fetchAll());
        return res;
    }

}
