
package emps;

import java.sql.Connection;

public class TestDB {
    public static void main(String[] args) {
        Connection testConn = DBconnect.connect();
        if (testConn != null) {
            System.out.println("Test Connection: Success!");
        } else {
            System.out.println("Test Connection: Failed!");
        }
    }
}

