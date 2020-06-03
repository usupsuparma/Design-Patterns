package objectpool;

import singleton.Connection;

import java.util.ArrayList;
import java.util.List;

public class DatabasePool {
    private static List<Connection> pool = new ArrayList<>();

    static  {
        for (int i =0; i< 100; i++) {
            Connection connection = new Connection("Localhost", "root", "root");
            pool.add(connection);
        }
    }

    public static Connection getConnection() {
        if(pool.isEmpty()) {
            throw  new RuntimeException("Koneksi habis");
        }else {
            return pool.remove(0);
        }
    }

    public static void close(Connection connection) {
        pool.add(connection);
    }
}
