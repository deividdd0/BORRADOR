package CRUD;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

        public void UpdateAdminId() throws SQLException {

                Connection connection = null;
                String url1 = "jdbc:mysql://localhost:3306/bd";
                String user = "root";
                String password = "2004";

                connection = DriverManager.getConnection(url1, user, password);

                String nombreUsuario = JOptionPane.showInputDialog(null, "Inserta el nombre del usuario que deseas editar");

                String nuevo_id = JOptionPane.showInputDialog(null, "Inserta un id");

                String query = "UPDATE admin SET id=? WHERE nombre=?";

                PreparedStatement pst = connection.prepareStatement(query);
                pst.setInt(1, Integer.parseInt(nuevo_id));
                pst.setString(2, nombreUsuario);

                pst.executeUpdate();
                pst.close();
                connection.close();
        }


        public void UpdateAdminNombre() throws SQLException {

                Connection connection = null;
                String url1 = "jdbc:mysql://localhost:3306/bd";
                String user = "root";
                String password = "2004";

                connection = DriverManager.getConnection(url1, user, password);

                String nombreUsuario = JOptionPane.showInputDialog(null, "Inserta el nombre del usuario que deseas editar");

                String nuevo_nombre = JOptionPane.showInputDialog(null, "Inserta el nuevo nombre");

                String query = "UPDATE admin SET nombre=? WHERE nombre=?";

                PreparedStatement pst = connection.prepareStatement(query);
                pst.setString(1, nuevo_nombre);
                pst.setString(2, nombreUsuario);

                pst.executeUpdate();
                pst.close();
                connection.close();
        }


        public void UpdateAdminCorreo() throws SQLException {

                Connection connection = null;
                String url1 = "jdbc:mysql://localhost:3306/bd";
                String user = "root";
                String password = "2004";

                connection = DriverManager.getConnection(url1,user,password);

                String nombreUsuario = JOptionPane.showInputDialog(null, "Inserta el nombre del usuario que deseas editar");

                String nuevo_correo = JOptionPane.showInputDialog(null, "Inserta el nuevo correo");

                String query = "UPDATE admin SET correo_electronico=? WHERE nombre=?";

                PreparedStatement pst = connection.prepareStatement(query);
                pst.setString(1, nuevo_correo);
                pst.setString(2, nombreUsuario);

                pst.executeUpdate();
                pst.close();
                connection.close();
        }


        public void UpdateAdminContrasena() throws SQLException {

                Connection connection = null;
                String url1 = "jdbc:mysql://localhost:3306/bd";
                String user = "root";
                String password = "2004";

                connection = DriverManager.getConnection(url1,user,password);

                String nombreUsuario = JOptionPane.showInputDialog(null, "Inserta el nombre del usuario que deseas editar");

                String nuevo_contrasena = JOptionPane.showInputDialog(null, "Inserta la nueva contraseña");

                String query = "UPDATE admin SET contrasena=? WHERE nombre=?";

                PreparedStatement pst = connection.prepareStatement(query);
                pst.setString(1, nuevo_contrasena);
                pst.setString(2, nombreUsuario);

                pst.executeUpdate();
                pst.close();
                connection.close();
        }





        public void UpdateUserId() throws SQLException {

                Connection connection = null;
                String url1 = "jdbc:mysql://localhost:3306/bd";
                String user = "root";
                String password = "2004";

                connection = DriverManager.getConnection(url1, user, password);

                String nombreUsuario = JOptionPane.showInputDialog(null, "Inserta el nombre del usuario que deseas editar");

                String nuevo_id = JOptionPane.showInputDialog(null, "Inserta un id");

                String query = "UPDATE usuarios SET id=? WHERE nombre=?";

                PreparedStatement pst = connection.prepareStatement(query);
                pst.setInt(1, Integer.parseInt(nuevo_id));
                pst.setString(2, nombreUsuario);

                pst.executeUpdate();
                pst.close();
                connection.close();
        }


        public void UpdateUserNombre() throws SQLException {

                Connection connection = null;
                String url1 = "jdbc:mysql://localhost:3306/bd";
                String user = "root";
                String password = "2004";

                connection = DriverManager.getConnection(url1, user, password);

                String nombreUsuario = JOptionPane.showInputDialog(null, "Inserta el nombre del usuario que deseas editar");

                String nuevo_nombre = JOptionPane.showInputDialog(null, "Inserta el nuevo nombre");

                String query = "UPDATE usuarios SET nombre=? WHERE nombre=?";

                PreparedStatement pst = connection.prepareStatement(query);
                pst.setString(1, nuevo_nombre);
                pst.setString(2, nombreUsuario);

                pst.executeUpdate();
                pst.close();
                connection.close();
        }


        public void UpdateUserCorreo() throws SQLException {

                Connection connection = null;
                String url1 = "jdbc:mysql://localhost:3306/bd";
                String user = "root";
                String password = "2004";

                connection = DriverManager.getConnection(url1,user,password);

                String nombreUsuario = JOptionPane.showInputDialog(null, "Inserta el nombre del usuario que deseas editar");

                String nuevo_correo = JOptionPane.showInputDialog(null, "Inserta el nuevo correo");

                String query = "UPDATE usuarios SET correo_electronico=? WHERE nombre=?";

                PreparedStatement pst = connection.prepareStatement(query);
                pst.setString(1, nuevo_correo);
                pst.setString(2, nombreUsuario);

                pst.executeUpdate();
                pst.close();
                connection.close();
        }


        public void UpdateUserContrasena() throws SQLException {

                Connection connection = null;
                String url1 = "jdbc:mysql://localhost:3306/bd";
                String user = "root";
                String password = "2004";

                connection = DriverManager.getConnection(url1,user,password);

                String nombreUsuario = JOptionPane.showInputDialog(null, "Inserta el nombre del usuario que deseas editar");

                String nuevo_contrasena = JOptionPane.showInputDialog(null, "Inserta la nueva contraseña");

                String query = "UPDATE usuarios SET contrasena=? WHERE nombre=?";

                PreparedStatement pst = connection.prepareStatement(query);
                pst.setString(1, nuevo_contrasena);
                pst.setString(2, nombreUsuario);

                pst.executeUpdate();
                pst.close();
                connection.close();
        }




}

