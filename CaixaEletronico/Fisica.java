package cliente;
import java.util.Scanner;
public class Fisica extends Pessoa {
    private String cpf;
    
    @Override
    public void cadastra(){
        Scanner tec = new Scanner(System.in);
        System.out.println("--- Cadastro de Pessoas Física ---");
        super.cadastra();
        System.out.println("Digite o CPF: ");
        cpf = tec.nextLine();
    }
    
    public void imprime(){
        System.out.println("Pessoa Fisica!");
        super.imprime();
        System.out.println("CPF: "+getCpf());
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
