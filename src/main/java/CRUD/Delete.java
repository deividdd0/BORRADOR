package CRUD;

import javax.swing.*;
import java.sql.*;

public class Delete {

    Connection conn = null;

    public void DeleteUser() throws SQLException {

        try {

            String url1 = "jdbc:mysql://localhost:3306/bd";

            String user = "root";

            String password = "2004";

            conn = DriverManager.getConnection(url1, user, password);


            String nombre = JOptionPane.showInputDialog(null, "Inserta el nombre");



            String query = "DELETE FROM usuarios WHERE nombre='" + nombre + "'";
            Statement st = conn.createStatement();

            st.execute(query);


        }catch (Throwable e){
            System.out.println("Ha fallado el borrado de datos");
            e.printStackTrace();
        }finally {
            try{
               conn.close();
            }catch (Throwable t){}
        }
    }


    public void DeleteAdmin() throws SQLException {

        try {

            String url1 = "jdbc:mysql://localhost:3306/bd";

            String user = "root";

            String password = "2004";

            conn = DriverManager.getConnection(url1, user, password);


            String nombre = JOptionPane.showInputDialog(null, "Inserta el nombre");



            String query = "DELETE FROM admin WHERE nombre='" + nombre + "'";
            Statement st = conn.createStatement();

            st.execute(query);


        }catch (Throwable e){
            System.out.println("Ha fallado el borrado de datos");
            e.printStackTrace();
        }finally {
            try{
                conn.close();
            }catch (Throwable t){}
        }
    }



}
