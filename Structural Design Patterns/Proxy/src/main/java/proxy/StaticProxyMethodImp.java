package proxy;

public class StaticProxyMethodImp implements iMethodInterafce {
    private iMethodInterafce methodImp;

    public StaticProxyMethodImp(iMethodInterafce methodImp){
        this.methodImp = methodImp;
    }

    public void method() {
        this.methodImp.method();
    }
}
