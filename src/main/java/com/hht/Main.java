package com.hht;

import com.hht.singleton.DataBaseConnector;

public class Main {

    public static void main(String[] args) {
        DataBaseConnector dataBaseConnector = DataBaseConnector.getInstance();
        System.out.println("el objeto databaseConnector es : "+ dataBaseConnector);

        DataBaseConnector dataBaseConnector1 = DataBaseConnector.getInstance();
        System.out.println("EL objeto1 es : "+ dataBaseConnector1);


        dataBaseConnector.connectDAtaBase();

        dataBaseConnector1.connectDAtaBase();
    }
}