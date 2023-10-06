package controleFluxo;

import java.util.Scanner;

public class Contador {
	
    public static void main(String[] args) {
    	
        try {
        	
            Scanner input = new Scanner(System.in);
            int num1;
            int num2;

            System.out.print("Digite o primeiro valor: ");
            num1 = input.nextInt();
            System.out.print("Digite o segundo valor: ");
            num2 = input.nextInt();
            contar(num1, num2);
            
        	} 
        catch(ParametrosInvalidosException e) {
        	
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        	}
    	}

    public static void contar(int num1, int num2) throws ParametrosInvalidosException {
    	
        if(num1 <= num2) {
        	
            for(int i = 1; i <= (num2 - num1); i++) {
            	
                System.out.println("Imprimindo o número " + i);
            }
        } else {
        	
            throw new ParametrosInvalidosException();
        }
    }
}