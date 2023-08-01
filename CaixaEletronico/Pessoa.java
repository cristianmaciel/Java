package cliente;
import java.util.Scanner;
public abstract class Pessoa {
    protected String telefone;
    protected String nomePessoa;
    protected Endereco e = new Endereco();
    
    
    public void cadastra(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o Nome: ");
        nomePessoa = tec.nextLine();
        System.out.println("Digite o Telefone: ");
        telefone = tec.nextLine();
        e.cadastra();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public Endereco getE() {
        return e;
    }

    public void setE(Endereco e) {
        this.e = e;
    }
    
    public void imprime(){
        System.out.println("Nome: "+getNomePessoa());
        System.out.println("Telefone: "+getTelefone());
    }   
}
