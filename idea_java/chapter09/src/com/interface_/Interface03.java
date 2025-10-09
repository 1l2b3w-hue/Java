package com.interface_;

public class Interface03 {
    public static void main(String[] args) {
        MyseqlDB myseqlDB = new MyseqlDB();
        work(myseqlDB);

        OracleDB oracleDB = new OracleDB();
        work(oracleDB);
    }
    public static void work(DBInterface db) {
        db.connect();
        db.close();

    }
}
