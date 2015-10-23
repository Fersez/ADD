import java.util.List;

public class FuncionesMat {
	public static double ent1(double n, double total){
		double e= n/total;
		if(e == 0 || e==1 ){
			return 0; //caso log 0 indeterminado
		}else{
			return - e * (Math.log(e) / Math.log(2));
		}
		
	}
	public static double entropia(double si,double no,double total){
		return  ent1(si,total) + ent1(no,total);
	}
	public static double ganancia(List<Pares> cantidad){
		
		double total= cantidad.get(0).getTotal();
		double res= entropia(cantidad.get(0).getSi(),cantidad.get(0).getNo(),total);
		for(int i=1;i<cantidad.size();i++){
			res = res - (cantidad.get(i).getTotal()/total)*entropia(cantidad.get(i).getSi(),cantidad.get(i).getNo(),cantidad.get(i).getTotal());
		}
		return res;
	}
	
}
