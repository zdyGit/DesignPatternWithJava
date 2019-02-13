package abstractfactory;

public class OracleUserDao implements iUserDao {
    public void addUser() {
        System.out.println("在Oracle数据库新增User");
    }

    public void deleteUser() {
        System.out.println("在Oracle数据库删除User");
    }
}
