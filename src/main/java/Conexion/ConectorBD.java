package Conexion;

import javax.swing.*;
import java.sql.*;

public class ConectorBD {

        public Connection conexion;
        public Statement sentencia;
        public ResultSet resultadoUser;

        public ResultSet resultadoAdmin;



    public void ConectarBasedeDatos(){
            try {
                final String Controlador = "com.mysql.cj.jdbc.Driver";
                Class.forName( Controlador );
                final String url_bd = "jdbc:mysql://localhost:3306/bd";
                conexion = DriverManager.getConnection(url_bd,"root","2004");
                sentencia = conexion.createStatement();
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
            }
        }
        public void DesconectarBasedeDatos() {
            try {
                if (conexion != null ) {
                    if(sentencia != null) {
                        sentencia.close();
                    }
                    conexion.close();
                }
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
        }
        public Connection getConnection(){
            return conexion;
        }
    }

