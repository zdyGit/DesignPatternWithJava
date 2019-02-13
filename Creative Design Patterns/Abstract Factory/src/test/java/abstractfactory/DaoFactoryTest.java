package abstractfactory;

import org.junit.Test;

public class DaoFactoryTest {

    @Test
    public void daoTest(){
        iDaoFactory daoFactory = new SQLServerDaoFactory();
        iUserDao userDao = daoFactory.getUserDao();
        userDao.addUser();
        userDao.deleteUser();

        iProductDao productDao = daoFactory.getProductDao();
        productDao.selectProduct();
        productDao.updateProduct();

        daoFactory = new OracleDaoFactory();
        userDao = daoFactory.getUserDao();
        userDao.addUser();
        userDao.deleteUser();

        productDao = daoFactory.getProductDao();
        productDao.selectProduct();
        productDao.updateProduct();

        }
}
