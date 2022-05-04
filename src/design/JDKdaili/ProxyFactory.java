package design.JDKdaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory  {
    private station st = new station();
    public sell getProxyObject(){
        sell proxyObject = (sell)Proxy.newProxyInstance(
                st.getClass().getClassLoader(),
                st.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("动态代理");
                    Object invoke = method.invoke(st, args);
                    return invoke+"dsds";
                }
        );
        return proxyObject;
    }
}
