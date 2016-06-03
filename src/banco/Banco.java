package banco;
import java.util.Scanner;
/**
 *
 * @author Hugo
 */
public class Banco {

    public static void main(String[] args) {
        boolean o=false,o1=false,t1,t2;
        int opcion, opcion2, dia;
        double deposito,retiro;
        String nombre;
        Scanner leer = new Scanner (System.in);
        System.out.println("Vamos a crear una cuenta.");
        System.out.println("Cuenta de ahorros (1) o de cheque (2) ?");
        opcion2=leer.nextInt();
        System.out.println("Ingresa tu nombre ");
        nombre=leer.next();
        CuentaAhorros ca1 = new CuentaAhorros (28,0.05,10005,nombre);
        CuentaCheque cc1 = new CuentaCheque (10,1,10005, nombre);
        while (o==false){
        System.out.println("Quieres consignar (1), retirar (2), ver tus datos (3) o salir (4)?");
        opcion=leer.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Cuanto quieres depositar?");
                deposito=leer.nextDouble();
                if (opcion2==1)
                    ca1.Depositar(deposito);
                else if (opcion2==2)
                    cc1.Depositar(deposito);
                break;
            case 2:
                System.out.println("Cuanto quieres retirar?");
                retiro=leer.nextDouble();
                if (opcion2==1){
                    System.out.println("Que dia es?");
                    dia=leer.nextInt();
                    ca1.Retirar(retiro,dia);
                }else{ if (opcion2==2)
                        cc1.Retirar(retiro);}
                break;
            case 3:
                if (opcion2==1)
                    ca1.ConsultarDatos();
                else if (opcion2==2)
                    cc1.ConsultarDatos();
                break;
            case 4:
                o=true;
                break;
        }
        }
    }
}
        
    
    
