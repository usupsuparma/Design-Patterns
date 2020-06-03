package singleton;


import static singleton.DatabaseHelper.*;

public class OrderService {
    public void save(String orderId) {
        // cara normal
//        Connection connection = new Connection("localhost", "root", "root");
//        getConnection().sql("INSERT INTO Oder .... ");

        // singleton
        getConnection().sql("Insert Into Order ....");
    }
}
