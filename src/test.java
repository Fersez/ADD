import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FuncionesMat.entropia(3,5,8));// correcto 0,954434003
		
		Pares moreno,rubio,rojo;
		moreno= new Pares(0,3);
		rubio= new Pares(2,2);
		rojo= new Pares(1,0);
		List<Pares> lista= new LinkedList<Pares>();
		lista.add(moreno);lista.add(rubio);lista.add(rojo);
		System.out.println(FuncionesMat.entropia(lista));
		
		
	}

}
