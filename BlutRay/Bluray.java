package BluRayInterface;

import java.util.Scanner;
import java.util.Vector;

public class Bluray implements InterfaceBluRay{
    private Vector<ItemBluRay>ListaBluray = new Vector<ItemBluRay>();
    @Override
    public void adicionarLista(ItemBluRay obj){
        this.ListaBluray.add(obj);
    }
    @Override
    public void imprimirLista(){
        System.out.println("Lista de Blu Ray");
        for(int i=0; i<this.ListaBluray.size(); i++){
            System.out.println("");
            System.out.println("Nome do Cliente:");
            System.out.println(this.ListaBluray.get(i).getNomeCliente());
            System.out.println("Preco do Blu-Ray");
            System.out.println(this.ListaBluray.get(i).getPreco());
        }
        System.out.println("----------------------------");
        System.out.println("");
    }
    public void cadastrarBlueRay(ItemBluRay obj){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome do Cliente: ");
        obj.setNomeCliente(scan.nextLine());
        System.out.println("Preco: ");
        obj.setPreco(scan.nextDouble());
    }
}
