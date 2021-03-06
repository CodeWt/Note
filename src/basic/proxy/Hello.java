package basic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: wtt
 * @Date: 20-5-25
 * @Description:
 *
 * Java标准库提供了动态代理功能，允许在运行期动态创建一个接口的实例；
 * 动态代理是通过Proxy创建代理对象，然后将接口方法“代理”给InvocationHandler完成的。
 */
public interface Hello {
    void evening(String name);
}
class Main{
    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("evening")){
                    System.out.println("Good evening, " + args[0]);
                }
                return null;
            }
        };
        Hello hello = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(),
                new Class[]{Hello.class},
                handler
        );
        hello.evening("WT");
    }
}
