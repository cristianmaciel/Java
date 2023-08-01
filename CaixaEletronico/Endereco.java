package cliente;
import java.util.Scanner;
public class Endereco {
    private String rua;
    private int numero;
    private String cidade;
    private String uf;
    
    public void cadastra(){
        Scanner tec = new Scanner(System.in);
        System.out.println("--- Cadastro de Endereço ---");
        System.out.println("Digite o Nome da Rua: ");
        rua = tec.nextLine();
        System.out.println("Digite o numero do estabelecimento: ");
        numero = Integer.parseInt(tec.nextLine());
        System.out.println("Digite o Nome da Cidade: ");
        cidade = tec.nextLine();
        System.out.println("Digite o Nome da Sigla do Estado: ");
        uf = tec.nextLine();
        
        //metodos gets e sets
        
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
        
}
