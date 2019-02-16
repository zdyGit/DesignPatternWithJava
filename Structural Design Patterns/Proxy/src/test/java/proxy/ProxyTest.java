package proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    public void proxyMethod(){
        StaticProxyMethodImp staticProxyMethodImp = new StaticProxyMethodImp(new MethodImp());
        staticProxyMethodImp.method();

        iMethodInterafce methodImp = new MethodImp();
        DynamicProxyMethodImp proxy = new DynamicProxyMethodImp(methodImp);
        ClassLoader classLoader = methodImp.getClass().getClassLoader();
        iMethodInterafce mImp = (iMethodInterafce) Proxy.newProxyInstance(classLoader,new Class[]{iMethodInterafce.class},proxy);
        mImp.method();
    }
}
