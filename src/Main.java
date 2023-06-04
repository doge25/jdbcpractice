import db.DBConnector;
import db.IDBConnector;
import tables.AbsTable;
import tables.UserTable;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, String> columns = new HashMap<String, String>() {{
        put("id", "int");
        put("name", "varchar(10)");

    }};

    public static void main(String... args) {
        AbsTable userTable = new UserTable();
        try {

            userTable.create(columns);

    } finally {
            userTable.close();
        }
        }
}
//вызов метода istableexist (если true , то вызвать метод delete)
