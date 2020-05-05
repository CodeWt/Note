package basic.proxy;

/**
 * @Author: wtt
 * @Date: 20-5-5
 * @Description:
 * 测试类
 */
public class ZTest {
    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();
        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();
        System.out.println("----------DynamicProxy-----------");
        //给目标对象创建代理对象
        IUserDao dproxy = (IUserDao)new ProxyFactory(target).getProxyInstance();
        //内存中动态生成的代理对象
        System.out.println(dproxy.getClass());
        //exe method [proxy obj]
        dproxy.save();
    }
}
