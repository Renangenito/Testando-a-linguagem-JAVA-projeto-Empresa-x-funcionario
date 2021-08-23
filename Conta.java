
public class Conta {

    private double saldo;
    private int numero;
    private int agencia;
    private Cliente titular;
    
    public Conta(int numero, int agencia){
        this.numero = numero;
        this.agencia = agencia;
    }

    public double deposita(double valor) {
        this.saldo += valor;
        return this.saldo;
        
    }
    public void saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }else{
            System.out.println("Saldo da conta é insuficiente!!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    
    
    
    
}
