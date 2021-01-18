import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws SQLException {
        GUI view = new GUI();
        database db = new database();

        view.setLogg(db.getData(1));
    }
}
