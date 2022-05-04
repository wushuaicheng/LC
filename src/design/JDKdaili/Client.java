package design.JDKdaili;

import java.util.PriorityQueue;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        sell proxyObject = proxyFactory.getProxyObject();
        System.out.println(proxyObject.get(4));
    }
}
