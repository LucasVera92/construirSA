/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construirsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ConstruirSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/obrador2024", "root", "");

//            String sql = "insert into empleado (dni, apellido, nombre, acceso, estado) "
//                    + "values (123456789, 'Francesa', 'Jacinto', 1, 1),"
//                    + "(987654321, 'Rodriguez', 'Romualdo', 2, 1),"
//                    + "(123678945, 'Peretz', 'Logi', 3, 1)";
//                String sql = "insert into herramienta (nombre, descripcion, stock, estado) "
//                        + "values ('Pala', 'Pala para palear', 25, 1),"
//                        + "('Soldadora','Soldadora re power', 9, 1)";
//            PreparedStatement ps = conexion.prepareStatement(sql);
//            int filas = ps.executeUpdate();
//            if (filas > 0) {
//                JOptionPane.showMessageDialog(null, "Herramientas agregadas");
           
//            String sql = "select * from herramienta where stock > 10";
//
//            PreparedStatement ps = conexion.prepareStatement(sql);
//            ResultSet resultado = ps.executeQuery();
//            while (resultado.next()) {
//
//                System.out.println("ID " + resultado.getInt("idherramienta"));
//                System.out.println("NOMBRE " + resultado.getString("nombre"));
//                System.out.println("DESCRIPCION " + resultado.getString("descripcion"));
//                System.out.println("STOCK " + resultado.getInt("stock"));
//                System.out.println("ESTADO " + resultado.getBoolean("estado"));

//            }

            String sql = "update empleado SET estado = false where idempleado = 1";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.executeUpdate();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error, driver no cargado correctamente");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión" + ex.getMessage());

        }

    }

}
