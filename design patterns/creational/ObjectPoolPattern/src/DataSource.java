import java.util.ArrayList;
import java.util.List;

public class DataSource {
    static DataSource instance = new DataSource();
    List<Connection> connectionPool = new ArrayList<>();

    private DataSource() {
        init();
    }

    private void init() {
        for (int i = 0; i < 3; i++) connectionPool.add(new Connection());
    }

    static Connection getConnection() throws NoConnectionsInPool {
        if (instance.connectionPool.size() == 0) throw new NoConnectionsInPool() ;

        Connection connection = instance.connectionPool.get(0);
        instance.connectionPool.remove(0);

        return connection;
    }

    static void release(Connection connection) {
        if (connection != null) instance.connectionPool.add(connection);
    }

    static class NoConnectionsInPool extends Throwable {

    }
}
