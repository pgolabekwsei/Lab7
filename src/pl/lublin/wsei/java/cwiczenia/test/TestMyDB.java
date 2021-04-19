package pl.lublin.wsei.java.cwiczenia.test;

import pl.lublin.wsei.java.cwiczenia.MyDB;

import java.sql.Connection;

public class TestMyDB {
    public static void main(String[] args) {
        MyDB db = new MyDB("localhost", 3306, "mydb");
        db.setUser("root");
        db.setPassword("*****");
        Connection conn = db.getConnection();
        if (conn != null)
            System.out.println("Połączenie z bazą danych nawiązane");
        db.closeConnection();
        System.out.println("Połączenie z bazą zakończone");
    }
}
