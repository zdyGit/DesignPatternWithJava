package abstractfactory;

public class SQLServerUserDao implements iUserDao {
    public void addUser() {
        System.out.println("在SQL Server数据库新增User");
    }

    public void deleteUser() {
        System.out.println("在SQL Server数据库删除User");
    }
}
