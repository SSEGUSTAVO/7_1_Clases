import java.util.*;
public class retiro{
    public void saldo(int p){
	Scanner entrada = new Scanner(System.in);
	int importe = 5000;
	while (p!=0){
	    if (p<=5000){
	        System.out.println("Puede retirar su efectivo.");
		break;
	    }
	    else if (p>5000){
	        System.out.println("No cuenta con fondos suficientes.");
		System.out.println("Ingrese nuevo monto.");
		p = entrada.nextInt();
	    }
	    else {
		System.out.println("Monto inválido.");
		System.out.println("Ingrese nuevo monto.");
		p = entrada.nextInt();
	    }
	}
    }
}