import java.util.*;
public class cuentadeahorro{
    public static void main(String[] args){
	titular cuenta = new titular();
	retiro efectivo = new retiro();
	Scanner input = new Scanner(System.in);
	System.out.print("Ingrese su contrase�a: ");
	int contrase�a = input.nextInt();
	while (contrase�a != 2435){
	    System.out.print("Error, ingrese de nuevo su contrase�a: ");
	    contrase�a = input.nextInt();
	}
	cuenta.registro("Edwin G.", 5000);
	System.out.println("�Cuanto desea retirar?");
	int monto = input.nextInt();
	efectivo.saldo(monto);
    }
}