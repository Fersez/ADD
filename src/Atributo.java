import java.util.LinkedList;
import java.util.List;

public class Atributo {
	String nombre;
	Integer columna;
	List<String> valores;
	public Atributo(String nombre,Integer columna){
		this.nombre=nombre;;
		this.columna=columna;
		valores= new LinkedList<String>();
	}
	public void add(String valor){
		valores.add(valor);
	}
	public boolean esta(String valor){
		return valores.contains(valor);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getColumna() {
		return columna;
	}
	public void setColumna(Integer columna) {
		this.columna = columna;
	}
	public List<String> getValores() {
		return valores;
	}
	public void setValores(List<String> valores) {
		this.valores = valores;
	}
	
	
}
