package CRUD;


import java.sql.*;

public class Read {

    public String leerUsers() {
        Connection conBD = null;
        try {
            conBD = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bd?serverTimezone=UTC", "root", "2004");
        } catch (SQLException error) {
            System.out.println("Error al conectar con el servidor MySQL/MariaDB: " + error.getMessage());
        }


        Statement mStm = null;
        try {
            mStm = conBD.createStatement();
        } catch (SQLException error) {
            System.out.println("Error al establecer declaración de conexión MySQL/MariaDB: " + error.getMessage());
        }

        ResultSet mRS = null;

        StringBuilder usuarios = null;
        try {
            mRS = mStm.executeQuery("Select id, nombre, correo_electronico, contrasena from usuarios");
            //Recorremos todos los registros del SQL devuelto en el ResultSet


            // ...
            usuarios = new StringBuilder();
            while (mRS.next()) {
                usuarios.append("  | id: |  ").append(mRS.getString(1))
                        .append("  | nombre: |  ").append(mRS.getString(2))
                        .append("  | correo_electronico: |  ").append(mRS.getString(3))
                        .append("  | contrasena: |  ").append(mRS.getString(4)).append("\n");
            }
            // ...

        } catch (SQLException error) {
            System.out.println("Error al ejecutar SQL en servidor MariaDB: " + error.getMessage());
        }

        //Cerramos el ResultSet, el Statement y la conexión
        try {
            mRS.close();
            mStm.close();
            conBD.close();
        } catch (SQLException error) {
            System.out.println("Error al cerrar conexión a servidor MariaDB: " + error.getMessage());
        }
        return usuarios.toString();
    }

    public String leerAdmins() {

        Connection conBD = null;
        try {
            conBD = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bd?serverTimezone=UTC", "root", "2004");
        } catch (SQLException error) {
            System.out.println("Error al conectar con el servidor MySQL/MariaDB: " + error.getMessage());
        }


        Statement mStm = null;
        try {
            mStm = conBD.createStatement();
        } catch (SQLException error) {
            System.out.println("Error al establecer declaración de conexión MySQL/MariaDB: " + error.getMessage());
        }

        ResultSet mRS = null;
        StringBuilder admins = null;
        try {
            mRS = mStm.executeQuery("Select id, nombre, correo_electronico, contrasena from admin");
            //Recorremos todos los registros del SQL devuelto en el ResultSet


            // ...
            admins = new StringBuilder();
            while (mRS.next()) {
                admins.append("  | id: |  ").append(mRS.getString(1))
                        .append("  | nombre: |  ").append(mRS.getString(2))
                        .append("  | correo_electronico: |  ").append(mRS.getString(3))
                        .append("  | contrasena: |  ").append(mRS.getString(4)).append("\n");
            }
            // ...
        } catch (SQLException error) {
            System.out.println("Error al ejecutar SQL en servidor MariaDB: " + error.getMessage());
        }

        try {
            mRS.close();
            mStm.close();
            conBD.close();
        } catch (SQLException error) {
            System.out.println("Error al cerrar conexión a servidor MariaDB: " + error.getMessage());
        }

        return admins.toString();
    }
}
