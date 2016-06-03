package banco;

/**
 *
 * @author Hugo
 */
public class CuentaAhorros extends Cuenta{
    private int Vencimiento;
    private double porInt;

    public CuentaAhorros(int Vencimiento, double porInt,
            int noCuenta, String nomCliente) {
        super(noCuenta, nomCliente);
        this.Vencimiento = Vencimiento;
        this.porInt = porInt;
    }

    public int getVencimiento() {
        return Vencimiento;
    }

    public void setVencimiento(int Vencimiento) {
        this.Vencimiento = Vencimiento;
    }

    public double getPorInt() {
        return porInt;
    }

    public void setPorInt(double porInt) {
        this.porInt = porInt;
    }
    
    public void InteresM(double porInt, int dia){
        if(dia==1)
        this.saldo = (saldo*porInt)+saldo;
    }

    //@Override
    public void Retirar(double retiro, int dia) {
        if(dia==Vencimiento)
            super.Retirar(retiro);
        else
            System.out.println("No puedes retirar hoy. ");
    }

    @Override
    public void ConsultarDatos() {
        super.ConsultarDatos();
        System.out.println("La fecha de vencimiento es "+Vencimiento);
        System.out.println("El interes es "+porInt);
    }
    
    
}
