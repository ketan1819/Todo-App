package com.example.todo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeMonitorAspect
{
    @Before("@annotation(TimeMonitor)")
    public void Logtime(ProceedingJoinPoint joinPoint) throws Throwable
    {
        long start = System.currentTimeMillis();

//        for(long i = 0;i<2000000000;i++)
//        {                       }

        try
        {
            joinPoint.proceed();
        }
        catch (Exception eobj)
        {
            System.out.println("Something error occures try later...");
        }
        finally
        {

            long end = System.currentTimeMillis();

            long TotalTime = end - start;
            System.out.println("Total execution time of the method is : "+TotalTime+" ms....");
        }
    }
}
