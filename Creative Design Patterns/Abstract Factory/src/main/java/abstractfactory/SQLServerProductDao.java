package abstractfactory;

public class SQLServerProductDao implements iProductDao {
    public void updateProduct() {
        System.out.println("更新SQL Server数据库中的Product");
    }

    public void selectProduct() {
        System.out.println("查询SQL Server数据库中的Product");
    }
}
