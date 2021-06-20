package cliente;

import java.util.Scanner;

public class ContaCorrente {

	public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   
	   double saldo = 100;
	   double saldo_atual;
	   double deposito;
	   double saque;
	   int esc;
	   
	   System.out.println("===========================");
	   System.out.println("=======BANCO DA PRAÇA======");
	   System.out.println("===========================");
	   System.out.println("O QUE DESJA ");
	   System.out.println("1 = PARA SAQUE ");
	   System.out.println("2 = PARA DEPÓSITO");
	   esc = sc.nextInt();
	   
	   
	   
	   switch (esc) {
	       case 1 :
	    	   
	    	   System.out.println("DIGITE O VALOR DO SAQUE");
	    	   saque = sc.nextDouble();	
	    	   if(saque < saldo) {
	    		   saldo_atual = saldo - saque;
	    		   System.out.println("VALOR DO SAQUE "+ saque);
		    	   System.out.println("O NOVO SALDO "+ saldo_atual);   
	    	   }
	    	 break;
	       
	       case 2:
	    	   System.out.println("DIGITE O VALOR DO DEPÓSITO ");
	    	   deposito = sc.nextDouble();
	    	   saldo_atual = saldo + deposito;
	    	   System.out.println("VALOR DO SAQUE "+ deposito);
	    	   System.out.println("NOVO SALDO " + saldo_atual);
	    	   break;
	    	   
	    }
	  
	}

}
