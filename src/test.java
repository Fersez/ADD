import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FuncionesMat.entropia(3,5,8));// correcto 0,954434003
		
		
		Pares decision,moreno,rubio,rojo;
		decision=new Pares(3,5);
		moreno= new Pares(0,3);
		rubio= new Pares(2,2);
		rojo= new Pares(1,0);
		List<Pares> lista= new LinkedList<Pares>();
		lista.add(decision);lista.add(moreno);lista.add(rubio);lista.add(rojo);
		System.out.println(FuncionesMat.ganancia(lista)); // ganancia color de pelo = 0,454434003 correcto
		
		
	}

}
