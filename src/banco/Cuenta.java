package banco;

/**
 *
 * @author Hugo
 */
public class Cuenta {
    protected int noCuenta;
    protected String nomCliente;
    protected double saldo=0;
    
    public Cuenta (int noCuenta, String nomCliente){
        this.noCuenta = noCuenta;
        this.nomCliente = nomCliente;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void ConsultarDatos(){
        System.out.println("Numero de cuenta "+noCuenta);
        System.out.println("Nombre del dueño "+nomCliente);
        System.out.println("El saldo es "+saldo);
    }
    
    public void Depositar (double deposito){
        saldo =saldo+deposito;
        System.out.println("El nuevo saldo es "+this.saldo);
    }
    
    public void Retirar (double retiro){
        if (this.saldo>=retiro){
            saldo =saldo- retiro;
            System.out.println("El nuevo saldo es "+saldo);
        }else
            System.out.println("No dispones de fondos suficientes.");
    }
}