package com.example.JavaEE8GetStarter.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Audited
@Interceptor
public class AuditedInterceptor {
    public static boolean calledBefore = false;
    public static boolean calledAfter = false;

    @AroundInvoke
    public Object auditMethod(InvocationContext ctx) throws Exception  {
        calledBefore = true;
        Object result  = ctx.proceed();
        System.out.println("Intercepted msg: " + result);
        calledAfter = true;
        return result;
    }
}
