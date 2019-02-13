package abstractfactory;

public class OracleDaoFactory implements iDaoFactory {
    public iUserDao getUserDao(){
        return new OracleUserDao();
    }

    public iProductDao getProductDao(){
        return new OracleProductDao();
    }
}
