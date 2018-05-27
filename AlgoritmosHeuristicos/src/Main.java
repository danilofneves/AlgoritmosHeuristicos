import java.util.LinkedList;

import br.ufs.algorithm.BuscaTabu;
import br.ufs.algorithm.HillClimbing;
import br.ufs.algorithm.ILS;
import br.ufs.algorithm.SimulatedAnnealing;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HillClimbing climbing = new HillClimbing(100, 0.01, -100, 100,1, 100000);
		imprimir(climbing.execute(1));
		
		HillClimbing climbing2 = new HillClimbing(100, 0.01, -100, 100,5, 100000);
		imprimir(climbing2.execute(1));
		
		HillClimbing climbing3 = new HillClimbing(100, 0.01, -100, 100,10, 100000);
		imprimir(climbing3.execute(1));*/
		
		
		/*SimulatedAnnealing simulatedAnnealing = new SimulatedAnnealing(100, 0.01,-100, 100,1,5000,100000);
		
		SimulatedAnnealing simulatedAnnealing2 = new SimulatedAnnealing(100, 0.01,-100, 100,5,5000,100000);
		
		SimulatedAnnealing simulatedAnnealing3 = new SimulatedAnnealing(100, 0.01,-100, 100,10,5000,100000);
		imprimir(simulatedAnnealing.execute(1));
		imprimir(simulatedAnnealing2.execute(1));
		imprimir(simulatedAnnealing3.execute(1));*/
		
		/*BuscaTabu tabu = new BuscaTabu(100,0.01,-100,100,1,10,10000,10);
		BuscaTabu tabu2 = new BuscaTabu(100,0.01,-100,100,1,5,5000,20);
		BuscaTabu tabu3 = new BuscaTabu(100,0.01,-100,100,1,10,100,1000);
		
		imprimir(tabu.execute(1));
		imprimir(tabu2.execute(1));
		imprimir(tabu3.execute(1));*/
		
		ILS ils = new ILS(100, 0.01, -100,  100, 1, 10000,10);
	}
	
	public static void imprimir(double[] s) {
		System.out.println(s[s.length-1]);
	}

}
