package banco;

/**
 *
 * @author Hugo
 */
public class CuentaCheque extends Cuenta {
    private double comisionxuso;
    private double comisionxchequemalo;

    public CuentaCheque(double comisionxuso, double comidionxchequemalo,
            int noCuenta, String nomCliente) {
        super(noCuenta, nomCliente);
        this.comisionxuso = comisionxuso;
        this.comisionxchequemalo = comidionxchequemalo;
    }

    public double getComisionxuso() {
        return comisionxuso;
    }

    public void setComisionxuso(double comisionxuso) {
        this.comisionxuso = comisionxuso;
    }

    public double getComidionxchequemalo() {
        return comisionxchequemalo;
    }

    public void setComidionxchequemalo(double comisionxchequemalo) {
        this.comisionxchequemalo = comisionxchequemalo;
    }

    @Override
    public void Retirar(double retiro) {
        if(saldo>retiro)
        super.Retirar(retiro);
        else{
            System.out.println("No dispones de fondos suficientes.");
            this.saldo=saldo-comisionxchequemalo;
        }
    }

    @Override
    public void ConsultarDatos() {
        super.ConsultarDatos();
        System.out.println("La comision por la chequera es "+comisionxuso);
        System.out.println("La comision por un cheque sin fondos es "+comisionxchequemalo);
    }
    
}
