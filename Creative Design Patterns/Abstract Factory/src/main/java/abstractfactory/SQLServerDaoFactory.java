package abstractfactory;

public class SQLServerDaoFactory implements iDaoFactory {
    public iUserDao getUserDao(){
        return new SQLServerUserDao();
    }

    public iProductDao getProductDao(){
        return new SQLServerProductDao();
    }
}
