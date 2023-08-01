package conta;
import cliente.Pessoa;
import java.util.Scanner;
public class Conta {
    private double saldo;
    private int numConta;
    private int tipoConta;
    private Pessoa titular = new Pessoa() {};
    public void cadastra(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        numConta = Integer.parseInt(tec.nextLine());
        System.out.println("Tipo da Conta: [1 - Conta Corrente] [2 - Conta Poupanca]");
        tipoConta = Integer.parseInt(tec.nextLine());
        System.out.println("Dados da Pessoa: ");
        titular.cadastra();
    }
    public void imprimeC(){
        System.out.println("Numero da Conta: "+getNumConta());
        if(getTipoConta()==1){
            System.out.println("Tipo de Conta: Conta Corrente");
        }else if(getTipoConta()==2){
            System.out.println("Tipo de Conta : Conta Poupanca");
        }
        titular.imprime();
    } 
    //construtor
    public Conta(){
        this.setSaldo(0.0);
    }
    
    //metodos gets e sets
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }  
}
