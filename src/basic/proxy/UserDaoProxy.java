package basic.proxy;

/**
 * @Author: wtt
 * @Date: 20-5-5
 * @Description:
 * 代理对象,静态代理
 */
public class UserDaoProxy implements IUserDao{
    //接收保存目标对象
    private IUserDao target;
    public UserDaoProxy(IUserDao target){
        this.target = target;
    }

    @Override
    public void save(){
        System.out.println("start transaction...");
        target.save();
        System.out.println("commit transaction...");
    }
}
