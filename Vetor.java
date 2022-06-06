import java.util.Scanner;
public class Vetor {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome[] = new String[5];
        for (int i=0; i < nome.length; i++){
            System.out.println("Digitime um nome:");
            nome[i]=leitura.next();
        }
        for (int i=0; i < nome.length; i++){
            System.out.println("O nome na posição "+i+" é: "+nome[i]);
        }
        leitura.close();
    }
}