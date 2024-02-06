import java.sql.Struct;

/**
 * @author Bruno.Silva
 * 
 * @version 1.0
 * 
 * Classe para manipulacao de conta bancaria
 */
public class Conta {
    private int agencia;
    private int conta;
    private String nomeCliente;
    private int saldo;
    
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public int getConta() {
        return conta;
    }
    
    public void setConta(int conta) {
        this.conta = conta;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public int getSaldo() {
        return saldo;
    }
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void imprimeConta() {
        System.out.println("Agencia :" + getAgencia());
        System.out.println("Conta : " + getConta());
        System.out.println("Nome : " + getNomeCliente());
        System.out.println("Saldo : " + getSaldo());
    }
    
}
