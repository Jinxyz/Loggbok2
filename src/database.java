import java.sql.*;

public class database {

    /**
     * Gets data from MySQL database
     * @param i
     * @return
     * @throws SQLException
     */

    public Body getData(int i)throws SQLException {

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://" + databaseConfig.DBURL + ":" + databaseConfig.port + "/" + databaseConfig.DBname +
                        "? allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                databaseConfig.user, databaseConfig.password);

        Statement stmt = conn.createStatement();

        String body = "not a valid id";
        String author = "not a valid id";

        String authorSelect = "select author from Logg where id = " + i;
        String bodySelect = "select body from Logg where id = " + i;

        ResultSet rset = stmt.executeQuery(authorSelect);

        while(rset.next())
            author = rset.getString("author");

        rset = stmt.executeQuery(bodySelect);

        while(rset.next())
            body = rset.getString("body");

        return new Body(author, body);
    }

    public void insertData(Body body1) throws SQLException{

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://" + databaseConfig.DBURL + ":" + databaseConfig.port + "/" + databaseConfig.DBname +
                        "? allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                databaseConfig.user, databaseConfig.password);

        Statement stmt = conn.createStatement();

        String body = body1.getText();
        String author = body1.getCreator();

        String loggSave = "INSERT INTO Logg (author, body) VALUES ( '" + author + "','" + body + "')";

        stmt.executeUpdate(loggSave);
    }
}