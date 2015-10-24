
import java.util.*;

public class analizadorDeDatos {
	Map<Integer,List<String>> datos; //= new HashMap<Integer,List<String>>();
	List<Atributo> atributos;
	List<Boolean> filas;
	List<Boolean> columnas;
	
	public analizadorDeDatos(Map<Integer,List<String>> datos,List<Atributo> atributos){
		this.datos=datos;
		this.atributos=atributos;
		filas=new LinkedList<Boolean>();
		columnas=new LinkedList<Boolean>();
		for(Integer i=0;i<datos.size();i++){
			filas.add(new Boolean(true));
		}
		for(Integer i=0;i<datos.get(0).size();i++){
			columnas.add(new Boolean(true));
		}
	}

	public List<Boolean> getColumnas() {
		return columnas;
	}

	public void setColumnas(List<Boolean> columnas) {
		this.columnas = columnas;
	}

	public Map<Integer, List<String>> getDatos() {
		return datos;
	}

	public List<Atributo> getAtributos() {
		return atributos;
	}

	public List<Boolean> getFilas() {
		return filas;
	}
	
	
	
	
}
