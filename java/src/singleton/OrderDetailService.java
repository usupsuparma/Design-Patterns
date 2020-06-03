package singleton;

import objectpool.DatabasePool;

import static singleton.DatabaseHelper.getConnection;

public class OrderDetailService {


    public void save(String orderId, String product) {
        getConnection().sql("INSET INTO Order_details ....");


        // design pattern object pool
        Connection connection = DatabasePool.getConnection();
        connection.sql("Insert INto Order_details ...");
        DatabasePool.close(connection);
    }



}
