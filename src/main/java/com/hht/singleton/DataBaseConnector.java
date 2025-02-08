package com.hht.singleton;


/*
 * 1) Tener un constructor privado
 * 2) Tener un otributo privado  además estatico
 * 3) Tener un método publico estatico que devuelva la clase
 */


public class DataBaseConnector {

    private static DataBaseConnector dataBaseConnector;

    private DataBaseConnector(){
        System.out.println("Creación de objeto");
    }

    public static DataBaseConnector getInstance(){
      if(dataBaseConnector == null){
          dataBaseConnector = new DataBaseConnector();
      }
      return dataBaseConnector;
    };

    public void connectDAtaBase(){
        System.out.println("conectando al a base de datos "+ dataBaseConnector);
    }

    public void disconnectDAtaBase(){
        System.out.println("desconectando al a base de datos "+ dataBaseConnector);
    }
}
