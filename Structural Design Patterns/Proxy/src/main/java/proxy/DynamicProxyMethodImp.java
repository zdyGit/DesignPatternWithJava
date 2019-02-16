package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyMethodImp implements InvocationHandler {

    private Object methodImp;
    public DynamicProxyMethodImp(Object methodImp){
        this.methodImp = methodImp;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(methodImp,args);
        return result;
    }
}
