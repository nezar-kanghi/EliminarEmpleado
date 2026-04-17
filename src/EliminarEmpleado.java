import java.sql.*;

public class EliminarEmpleado {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String usuario = "RIBERA";
        String password = "ribera";

        try(Connection conexion = DriverManager.getConnection(url,usuario,password)){

            //Eliminamos empleado por ID añadida manualmente

            String sql = "DELETE FROM empleadoEjemplo WHERE ID = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, 3);

            int n = ps.executeUpdate();
            System.out.println("Empleado borrado exitosamente " + n);
        }catch(SQLException e){
            System.out.println("Error al borrar de la tabla " + e.getMessage());
        }
    }
}