package com.example.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class todoController
{


    private TodoService todoService1 = null; // instance of the another todoservice
    private TodoService todoService2 = null; // instance of the fake todoservice



    private static List<Todo>  todos;
    public todoController(@Qualifier("AnotherTodoService") TodoService todoService1,@Qualifier("FakeTodoService") TodoService todoService2)
    {
        todos = new ArrayList<>();
        todos.add(new Todo(1,11,"todo 1",true));
        todos.add(new Todo(2,12,"todo 2",false));
        this.todoService1 = todoService1;
        this.todoService2 = todoService2;
    }



    @GetMapping("/todos")
    public List<Todo> getTodoList(@RequestParam(required = false) Boolean isCompleted)
    {
        System.out.println("Request params is completed here  "+" "+this.todoService1.DoSomething());
        System.out.println("Done by the Fake todoservice"+" "+this.todoService2.DoSomething());
        return null;
    }

    @PostMapping("/todos")
    public Todo CreateTodo(@RequestBody Todo newTodo)
    {
        todos.add(newTodo);
        return newTodo;
    }

    @GetMapping("/todos/{todoId}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long todoId) {
        for (Todo todo : todos) {
            if (todo.getId() == todoId) {
                return ResponseEntity.ok(todo);
            }
        }
        return ResponseEntity.notFound().build();
    }


}
