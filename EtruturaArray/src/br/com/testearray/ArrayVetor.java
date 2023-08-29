package br.com.testearray;

public class ArrayVetor {

	public static void main(String[] args) {
		
		//Array deve ter uma quantidade de posições definidas, e pode ser todos ostipos de dados e objetos
		double[] notas = new double[4];
		//caso o núnero de posições for menor, dará estouro e erro
		
		notas[0] = 8.8;
		notas[1] = 4.8;
		notas[2] = 6.8;
		notas[3] = 7.8;
		
		System.out.println(notas[1]);
		
	}

}
