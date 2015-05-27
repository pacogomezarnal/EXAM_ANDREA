import Modelo.ConexionDB;
import Vistas.Principal;


public class LabyApp {

	public static void main(String[] args) {
		boolean conexion = ConexionDB.getInstance().connectDB();
		if(conexion==true){
			Principal Principal = new Principal();
			Principal.setVisible(true);
		}else{
			System.out.println("No conectado");
		}

	}

}
