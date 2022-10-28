package com.example.solidexam.ocp;

import com.example.solidexam.ocp.jdbcImpl.MySql;
import com.example.solidexam.ocp.jdbcImpl.Oracle;

public class Main {

    public static void main(String[] args) {

        JDBC myDB = new MySql();
        myDB.Connection();
        myDB.Select();

        myDB = new Oracle();
        myDB.Connection();
        myDB.Select();

    }

}
