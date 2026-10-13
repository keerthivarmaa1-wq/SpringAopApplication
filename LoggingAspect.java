package com.examplle;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.employee.EmployeeService.*(..))")
    public void logBeforeMethod() {
        System.out.println("Logging: Service method is executing");
    }
}
