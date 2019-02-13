package abstractfactory;

public interface iDaoFactory {
    iUserDao getUserDao();

    iProductDao getProductDao();
}
