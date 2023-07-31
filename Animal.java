package animal;
public abstract class  Animal {
    private String nome;
    private int idade;
    //metodos abstratos 
    public abstract void seLocomove();
    public abstract void emiteSom();
    //metodos gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
