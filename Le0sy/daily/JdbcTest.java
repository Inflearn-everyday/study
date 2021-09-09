import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class JdbcTest {
    private String ip;
    private int port;
    private String database;
    private String user;
    private String password;
    private String DRIVER_NAME;
    private String JDBC_URL;

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void gen_url() {
        DRIVER_NAME = {driver_name};
        JDBC_URL = "jdbc:{db}:thin:@" + this.ip + ":" + this.port + ":" + this.database;
    }

    private Connection conn = null;

    private void connect() {
        try {
            Class.forName(DRIVER_NAME);
            conn = DriverManager.getConnection(JDBC_URL, user, password);
        } catch (ClassNotFoundException e) {
            System.err.println(e);
            System.exit(-1);
        } catch (SQLException e) {
            System.err.println(e);
            System.exit(-1);
        }
    }

    private void executeQuery(String qry) {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(qry);
            ResultSetMetaData rsmetaData = rs.getMetaData();
            int columnCount = rsmetaData.getColumnCount();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%10s ", rsmetaData.getColumnName(1)));
            for (int i = 2; i <= columnCount; i++) {
                sb.append(String.format("| %10s ", rsmetaData.getColumnName(i)));
            }
            sb.append("\n");
            int columnNameLen = sb.length();
            for (int i = 0; i < columnNameLen - 1; i++) {
                sb.append("-");
            }
            sb.append("\n");
            while (rs.next()) {
                sb.append(String.format("%10s ", rs.getString(1)));
                for (int i = 2; i <= columnCount; i++) {
                    sb.append(String.format("| %10s ", rs.getString(i)));
                }
                sb.append("\n");
            }
            System.out.println(sb);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private void disconnect() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public static void main(String[] args) {
        JdbcTest jt = new JdbcTest();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" --- jdbc connection test ---");
        try {
            System.out.print("IP : ");
            String tmp = br.readLine();
            jt.setIp(tmp.isEmpty() ? {default_IP} : tmp);

            System.out.print("Port : ");
            tmp = br.readLine();
            jt.setPort(tmp.isEmpty() ? {default_Port} : Integer.parseInt(tmp));

            System.out.print("Database : ");
            tmp = br.readLine();
            jt.setDatabase(tmp.isEmpty() ? {default_DBname} : tmp);

            System.out.print("User : ");
            tmp = br.readLine();
            jt.setUser(tmp.isEmpty() ? {default_Username} : tmp);

            System.out.print("Password: ");
            jt.setPassword(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        jt.gen_url();
        jt.connect();
        System.out.println("\n --- connection complete ---");
        String qry = "";

        while (!qry.equals("exit;")) {
            int i = 1;
            qry = "";
            System.out.print("SQL>> ");
            try {
                qry = br.readLine();
                if (qry.isEmpty()) continue;
                while (qry.charAt(qry.length() - 1) != ';') {
                    System.out.printf("    %d ", ++i);
                    qry += br.readLine();
                }
                if (qry.equals("exit;")) break;
                jt.executeQuery(qry);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        jt.disconnect();
    }
}
