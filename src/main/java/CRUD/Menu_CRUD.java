package CRUD;

import Interfaz.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Menu_CRUD {

    public void frame() {
        JFrame frame = new JFrame("MENU");
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        Login login = new Login();

        panel.setLayout(null);

        panel.setBackground(Color.GRAY);

        JButton btnLeer = new JButton("Leer");
        btnLeer.setBounds(10, 80, 80, 25);
        panel.add(btnLeer);

        JButton btnCrear = new JButton("Crear");
        btnCrear.setBounds(10, 120, 80, 25);
        panel.add(btnCrear);

        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(10, 160, 80, 25);
        panel.add(btnBorrar);

        JButton btnEditar = new JButton("Editar");
        btnEditar.setBounds(10, 200, 80, 25);
        panel.add(btnEditar);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(350, 500, 80, 25);
        panel.add(btnSalir);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(120, 80, 350, 320);
        panel.add(scrollPane);


        btnLeer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //String Tablas[] = {"Tabla 1", "Tabla 2"};
                int opcion = JOptionPane.showOptionDialog(null, "Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Tabla de Usuarios", "Tabla de Admins"}, "Tabla de Usuarios");

                if (opcion == 0) {

                    Read read = new Read();
                    String usuarios = read.leerUsers();
                    textArea.setText(usuarios);

                }
                if (opcion == 1) {

                    Read read = new Read();
                    String admins = read.leerAdmins();
                    textArea.setText(admins);

                } else {

                }
            }
        });

        btnCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int opcion = JOptionPane.showOptionDialog(null, "Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Usuario", "Admin"}, "Usuario");

                if (opcion == 0) {

                    Create create = new Create();

                    try {
                        create.CreateUser();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
                if (opcion == 1) {

                    Create create = new Create();

                    try {
                        create.CreateAdmin();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }


                } else {

                }
            }
        });

        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int opcion = JOptionPane.showOptionDialog(null, "Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Usuario", "Admin"}, "Usuario");

                if (opcion == 0) {

                    Delete delete = new Delete();
                    try {
                        delete.DeleteUser();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
                if (opcion == 1) {

                    Delete delete = new Delete();
                    try {
                        delete.DeleteAdmin();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                } else {

                }
            }
        });


        btnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int opcion = JOptionPane.showOptionDialog(null, "Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Usuario", "Admin"}, "Usuario");

                if (opcion == 0) {

                    int opcion2 = JOptionPane.showOptionDialog(null, "Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"ID", "Nombre", "Correo", "Contraseña"}, "ID");

                    if (opcion2 == 0) {

                        Update update = new Update();

                        try {

                            update.UpdateUserId();
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                    if (opcion2 == 1) {

                        Update update = new Update();

                        try {

                            update.UpdateUserNombre();
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                    if (opcion2 == 2) {

                        Update update = new Update();

                        try {

                            update.UpdateUserCorreo();
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }


                    }
                    if (opcion2 == 3) {

                        Update update = new Update();

                        try {

                            update.UpdateUserContrasena();
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }

                    }


                }
                if (opcion == 1) {

                    int opcion2 = JOptionPane.showOptionDialog(null, "Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"ID", "Nombre", "Correo", "Contraseña"}, "ID");

                    if (opcion2 == 0) {

                        Update update = new Update();

                        try {

                            update.UpdateAdminId();
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                    if (opcion2 == 1) {

                        Update update = new Update();

                        try {

                            update.UpdateAdminNombre();
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                    if (opcion2 == 2) {

                        Update update = new Update();

                        try {

                            update.UpdateAdminCorreo();
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }


                    }
                    if (opcion2 == 3) {

                        Update update = new Update();

                        try {

                            update.UpdateAdminContrasena();
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }

                    }

                }
            }

        });


        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }

        });

    }

}




