package CRUD;

import Conexion.ConectorBD;

import javax.swing.*;
import java.sql.*;



public class Create {


        public void CreateUser() throws SQLException {

            Connection connection = null;
            String url1 = "jdbc:mysql://localhost:3306/bd";

            String user = "root";

            String password = "2004";

            connection = DriverManager.getConnection(url1,user,password);

            String id = JOptionPane.showInputDialog(null, "Inserta un id");

            String nombre = JOptionPane.showInputDialog(null, "Inserta el nombre");

            String correo_electronico = JOptionPane.showInputDialog(null, "Inserta el correo electronico");

            String contrasena = JOptionPane.showInputDialog(null, "Inserta una contrasena");



            String query = "INSERT INTO usuarios values (?,?,?,?)";
            PreparedStatement pst =connection.prepareStatement(query);
            pst.setInt(1, Integer.parseInt(id));
            pst.setString(2, nombre);
            pst.setString(3, correo_electronico);
            pst.setString(4, contrasena);

            pst.executeUpdate();
            pst.close();

        }

    public void CreateAdmin() throws SQLException {

        Connection connection = null;
        String url1 = "jdbc:mysql://localhost:3306/bd";

        String user = "root";

        String password = "2004";

        connection = DriverManager.getConnection(url1,user,password);

        String id = JOptionPane.showInputDialog(null, "Inserta un id");

        String nombre = JOptionPane.showInputDialog(null, "Inserta el nombre");

        String correo_electronico = JOptionPane.showInputDialog(null, "Inserta el correo electronico");

        String contrasena = JOptionPane.showInputDialog(null, "Inserta una contrasena");



        String query = "INSERT INTO admin values (?,?,?,?)";
        PreparedStatement pst =connection.prepareStatement(query);
        pst.setInt(1, Integer.parseInt(id));
        pst.setString(2, nombre);
        pst.setString(3, correo_electronico);
        pst.setString(4, contrasena);

        pst.executeUpdate();
        pst.close();

    }
    }

