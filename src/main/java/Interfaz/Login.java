package Interfaz;
import CRUD.Menu_CRUD;
import Conexion.ConectorBD;

import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Login {

    public String username;

    public String password;

    public void frame() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JFrame frame = new JFrame("Login");
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 40, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(180, 80, 80, 25);
        panel.add(cancelButton);

        loginButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                Login login = new Login();
                ConectorBD conBDUser = new ConectorBD();
                ConectorBD conBDAdmin = new ConectorBD();
                login.username = userText.getText();
                login.password = new String(passwordText.getPassword());


                try {
                    conBDUser.ConectarBasedeDatos();

                    String usuariosSQL = "SELECT COUNT(id) AS i FROM usuarios WHERE correo_electronico = '" + login.username + "'" + " AND contrasena = '" + login.password + "'";
                    conBDUser.resultadoUser = conBDUser.sentencia.executeQuery(usuariosSQL);

                    if (conBDUser.resultadoUser.next() && conBDUser.resultadoUser.getString("i").equals("1")) {
                        JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso (USUARIO)");


                        Menu_CRUD main = new Menu_CRUD();
                        main.frame();



                    } else {
                        conBDAdmin.ConectarBasedeDatos();

                        String adminSQL = "SELECT COUNT(id) AS i FROM admin WHERE correo_electronico = '" + login.username + "'" + " AND contrasena = '" + login.password + "'";
                        conBDAdmin.resultadoAdmin = conBDAdmin.sentencia.executeQuery(adminSQL);

                        if (conBDAdmin.resultadoAdmin.next() && conBDAdmin.resultadoAdmin.getString("i").equals("1")) {
                            JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso (ADMIN)");


                            Menu_CRUD main = new Menu_CRUD();
                            main.frame();

                        } else {
                            JOptionPane.showMessageDialog(null, "Usuario o Contraseña inválidos");
                        }

                        conBDAdmin.DesconectarBasedeDatos();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    conBDUser.DesconectarBasedeDatos();
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}



