
package Utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JDBCHeper {
    public static ResultSet excuteQuery(String sql, Object... args) {
        ResultSet rs = null;
        Connection cn = null;
        PreparedStatement pr = null;

        cn = DBConnection.openDbConnection();
        try {
            pr = cn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                pr.setObject(i + 1, args[i]);
            }
            rs = pr.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }

    public static Integer excuteUpdate(String sql, Object... args) {
        Integer row = 0;
        Connection cn = null;
        PreparedStatement pr = null;

        cn = DBConnection.openDbConnection();
        try {
            pr = cn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                pr.setObject(i + 1, args[i]);
            }
            row = pr.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return row;
    } 
}
