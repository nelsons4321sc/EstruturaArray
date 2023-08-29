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
		//retirando o manual
		/*
		System.out.println("Nota 1 = "+notas[0]);
		System.out.println("Nota 2 = "+notas[1]);
		System.out.println("Nota 3 = "+notas[2]);
		System.out.println("Nota 4 = "+notas[3]);
		*/
		//adicionado dinamicamente
		for(int pos=0; pos<=3; pos++) {
			//tem que ser adicionado a pos +1 entre parenteses, para imprimir as notas corretamente
			System.out.println("Nota "+(pos+1)+" = "+notas[pos]);
		}
		
	}

}
