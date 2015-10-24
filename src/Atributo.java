import java.util.LinkedList;
import java.util.List;

public class Atributo {
	String nombre;
	
	List<String> valores;
	public Atributo(String nombre,List<String> valores){
		this.nombre=nombre;;
		
		this.valores= valores;
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

	public List<String> getValores() {
		return valores;
	}
	public void setValores(List<String> valores) {
		this.valores = valores;
	}
	
	
}
