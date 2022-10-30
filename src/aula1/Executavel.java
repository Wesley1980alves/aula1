package aula1;

public class Executavel {

	public static void main(String[] args) {
		int []vetorA= {1,2,3,4,5,6,7,8,9,10};
		int[]vetorB =new int[10];
		int resultado;
		
		for(int cont=0;cont<vetorA.length;cont++) {
			resultado=vetorA[cont]*cont;
			vetorB[cont]=vetorA[cont];
			System.out.println( "Os valores do vetor B>>[ "+resultado+"]");
		}
		

	}

}
