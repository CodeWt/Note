package basic.proxy;

/**
 * @Author: wtt
 * @Date: 20-5-5
 * @Description:
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("[----already save date----]");
    }
}
