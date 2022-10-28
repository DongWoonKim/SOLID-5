package com.example.solidexam.ocp.jdbcImpl;

import com.example.solidexam.ocp.JDBC;

public class Oracle implements JDBC {
    @Override
    public void Connection() {
        System.out.println("Oracle Connection");
    }

    @Override
    public void Select() {
        System.out.println("Oracle Select");
    }

    @Override
    public void Insert() {
        System.out.println("Oracle Insert");
    }

    @Override
    public void Update() {
        System.out.println("Oracle Update");
    }

    @Override
    public void Delete() {
        System.out.println("Oracle Delete");
    }
}
