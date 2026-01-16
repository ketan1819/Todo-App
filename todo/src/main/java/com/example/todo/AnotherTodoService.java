package com.example.todo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("AnotherTodoService")
public class AnotherTodoService implements TodoService
{
//    @BeforeGreeting
    public String DoSomething()
    {
        return "did something by the another todoservice";
    }
}
