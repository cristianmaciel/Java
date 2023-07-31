package animal;
import java.util.Scanner;
public class Principal {
    Animal vetAni[] = new Animal[30];
    static int tam = 0;
    public static void main(String[] args) {
        int opcao = 0;
        Scanner tec = new Scanner(System.in);
        Principal ap = new Principal();
        while(opcao!=3){
            System.out.println("Digite a Opcao Desejada:");
            System.out.println("1 - Cadastrar:");
            System.out.println("2- Listar:");
            System.out.println("3 - Sair:");
            opcao = tec.nextInt();
            tec.nextLine();
            switch(opcao){
                case 1:
                    ap.cadastraAnimal();
                    break;
                case 2:
                    ap.imprimeAnimais();
                    break;
                case 3:
                    System.out.println("'Saindo.");
                    break;
                default:
                    System.out.println("Opcao Invalida:");
                    break;
            }
        }
    }
    public void cadastraAnimal(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o tipo de Animal: ");
        System.out.println("1 - Cachorro");
        System.out.println("2 - Cavalo");
        System.out.println("3 - Preguica");
        int i = tec.nextInt();
        tec.nextLine();
        if (i==1 || i==3 || i==2){
        System.out.println("Digite o Nome do Animal");
        String n = tec.nextLine();
        System.out.println("Digite a Idade do Animal");
        int id = tec.nextInt();
        tec.nextLine();
        if(i==1)
            vetAni[tam] = new Cachorro(n,id);
        else if (i==2)
            vetAni[tam] = new Cavalo(n,id);
        else if(i==3)
            vetAni[tam] = new Preguica(n,id);
        tam=tam+1;
        }    
    }
    public void imprimeAnimais(){
        Scanner tec = new Scanner(System.in);
        for (int i=0; i<tam; i++){
            System.out.println("Codigo do Animal: "+i+1);
            vetAni[i].seLocomove();
        }
        System.out.println("Digite o codigo do Animal que deseja Ver");
        int cod = tec.nextInt();
        tec.nextLine();
        vetAni[cod].seLocomove();
        vetAni[cod].emiteSom();
    }
    
}
