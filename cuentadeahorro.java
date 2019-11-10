import java.util.*;
public class cuentadeahorro{
    public static void main(String[] args){
	titular cuenta = new titular();
	retiro efectivo = new retiro();
	Scanner input = new Scanner(System.in);
	System.out.print("Ingrese su contraseña: ");
	int contraseña = input.nextInt();
	while (contraseña != 2435){
	    System.out.print("Error, ingrese de nuevo su contraseña: ");
	    contraseña = input.nextInt();
	}
	cuenta.registro("Edwin G.", 5000);
	System.out.println("¿Cuanto desea retirar?");
	int monto = input.nextInt();
	efectivo.saldo(monto);
    }
}