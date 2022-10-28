package com.example.solidexam.ocp.jdbcImpl;

import com.example.solidexam.ocp.JDBC;

public class MySql implements JDBC {
    @Override
    public void Connection() {
        System.out.println("MySql Connection");
    }

    @Override
    public void Select() {
        System.out.println("MySql Select");
    }

    @Override
    public void Insert() {
        System.out.println("MySql Insert");
    }

    @Override
    public void Update() {
        System.out.println("MySql Update");
    }

    @Override
    public void Delete() {
        System.out.println("MySql Delete");
    }
}
