package com.example.todo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("FakeTodoService")
public class FakeTodoService implements TodoService
{
    @TimeMonitor
    public String DoSomething()
    {
        for(long i = 0;i<1000000000L;i++){}
        return "Did Something...!!";
    }
}
