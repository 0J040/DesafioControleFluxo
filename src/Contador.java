import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		
        Scanner terminal = new Scanner(System.in);
		
        System.out.println(" Digite o primeiro parâmetro ");
		int parametroUm = terminal.nextInt();
		
        System.out.println(" Digite o segundo parâmetro ");
		int parametroDois = terminal.nextInt();

        terminal.close();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois); 
		} catch (ParametrosInvalidosException exception) {
            System.err.println(exception.getMessage()); 
		} 
		
	}
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
	    // Validar se parametroUm é maior que parametroDois
	    if (parametroUm > parametroDois) {
	        throw new ParametrosInvalidosException(" O segundo parâmetro deve ser maior que o primeiro. ");
	    }

	    int contagem = parametroDois - parametroUm;

	    // Realizar o for para imprimir os números com base na variável contagem
	    for (int dedodaMao = 1; dedodaMao <= contagem; dedodaMao++) {
	        System.out.println(" Imprimindo o Número: " + dedodaMao);
	    }
	}
}