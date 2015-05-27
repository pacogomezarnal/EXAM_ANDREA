package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//Clase que comprueba el codigo de entrada
public class IngresoCadete {
	//CONSULTA A LA BASE DE DATOS
	private final static String CHECK_SEL="SELECT id FROM cadetes WHERE id=1";
	private final static String EQ="SELECT equipo FROM cadetes WHERE equipo=1";
	
	//Conexion
	private Connection conexion = null;// maneja la conexió
	private Statement instruccion = null;
	private ResultSet resultado = null;

	public IngresoCadete() {
		//Obtenemos la conexion de datos
		conexion=ConexionDB.getConexion();		
	}
	
	public ArrayList<Cadete> getDatos(){
		ArrayList<Cadete> cadet=new ArrayList<Cadete>();
		
		try{
			instruccion = this.conexion.createStatement(); //Carga la sentencia SQL
			resultado = instruccion.executeQuery(EQ); //Ejecutar la sentencia SQL
			
			//Bucle para guardar datos en un array
			while( resultado.next() ) {
				cadet.add((Cadete) resultado);
			}
			
		}catch(SQLException exceptionSql){
			exceptionSql.printStackTrace();
		} finally { //Cerrar conexiones con BD
			try{
				resultado.close();
				instruccion.close();
			}catch( SQLException excepcionSql ) { //excepcion de error
				excepcionSql.printStackTrace();
			}
		}
		return cadet;
	}
	
	public int comprobarCod(int id){
		try{
			instruccion = this.conexion.createStatement();
			resultado = instruccion.executeQuery(CHECK_SEL+String.valueOf(id));
			
			//Listaremos por pantalla los datos
			while(resultado.next() ) {
				//Cadete.add(resultado.getString("id"));
			} // fin while
		}
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
		}
		finally{
			try{
				resultado.close();
				instruccion.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
		return id;	
	}

}
