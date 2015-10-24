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
		
		analizadorDeDatos adedatos;
		List<Atributo> atributos=new LinkedList<Atributo>();
		Map<Integer,List<String>> datos = new HashMap<Integer,List<String>>();
		Atributo a;
		List<String> t = new LinkedList<String>();
		
		t.add("+");t.add("-");
		a= new Atributo("Atributo de salida",t);
		atributos.add(a);
		
		t = new LinkedList<String>();
		t.add("Alto");t.add("Bajo");
		a= new Atributo("Altura",t);
		atributos.add(a);
		
		t = new LinkedList<String>();
		t.add("moreno");t.add("Rojo");t.add("Rubio");
		a= new Atributo("Color de pelo",t);
		atributos.add(a);
		
		t = new LinkedList<String>();
		t.add("Azules");t.add("Marrones");
		a= new Atributo("Color de ojos",t);
		atributos.add(a);
		List<String> fila =new LinkedList<String>();
		fila.add("-");fila.add("Alto");fila.add("Moreno");fila.add("Azules");
		datos.put(1,fila);
		
		fila =new LinkedList<String>();
		fila.add("-");fila.add("Bajo");fila.add("Moreno");fila.add("Azules");
		datos.put(2,fila);
		fila =new LinkedList<String>();
		fila.add("+");fila.add("Alto");fila.add("Rojo");fila.add("Azules");
		datos.put(3,fila);
		fila =new LinkedList<String>();
		fila.add("+");fila.add("Alto");fila.add("Rubio");fila.add("Azules");
		datos.put(4,fila);
		fila =new LinkedList<String>();
		fila.add("+");fila.add("Bajo");fila.add("Rubio");fila.add("Azules");
		datos.put(5,fila);
		fila =new LinkedList<String>();
		fila.add("-");fila.add("Alto");fila.add("Moreno");fila.add("Marrones");
		datos.put(6,fila);
		fila =new LinkedList<String>();
		fila.add("-");fila.add("Alto");fila.add("Rubio");fila.add("Marrones");
		datos.put(7,fila);
		fila =new LinkedList<String>();
		fila.add("-");fila.add("Bajo");fila.add("Rubio");fila.add("Marrones");
		datos.put(0,fila);
		
		
		adedatos= new analizadorDeDatos(datos,atributos);
		
		System.out.println(datos.toString());
	}

}
