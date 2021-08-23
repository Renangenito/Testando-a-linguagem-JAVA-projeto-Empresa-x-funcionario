
public class TesteContaRenan {
    public static void main(String[] args){
       Conta contaDoRenan = new Conta(12345, 1334);
       contaDoRenan.deposita(300);
       contaDoRenan.saca(400);
     
        System.out.println("Seu saldo é de " + contaDoRenan.getSaldo());
        
        
        Cliente clienteRenan = new Cliente();
        contaDoRenan.setTitular(clienteRenan);
        clienteRenan.setNome("Renan Bezerra de Lima");
        System.out.println(contaDoRenan.getAgencia());
       
    }
}
