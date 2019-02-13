package abstractfactory;

public class OracleProductDao implements iProductDao {
    public void updateProduct() {
        System.out.println("更新Oracle数据库中的Product");
    }

    public void selectProduct() {
        System.out.println("查询Oracle数据库中的Product");
    }
}
