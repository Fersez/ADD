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
	public static double entropia(List<Pares> cantidad){
		double res=0;
		for(int i=0;i<cantidad.size();i++){
			res = res + entropia(cantidad.get(i).getSi(),cantidad.get(i).getNo(),cantidad.get(i).getTotal());
		}
		return res;
	}
	
}
