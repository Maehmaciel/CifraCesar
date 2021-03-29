
import java.util.Scanner; // 1. importando a classe Scanner

public class CifraCesar {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int k;
        String mensagem;

        System.out.printf("Mensagem: ");
        mensagem = ler.nextLine();

        System.out.printf("K: ");
        k = ler.nextInt();

        String criptografado = criptografar(mensagem, k);
        System.out.println(criptografado);
    }

    public static String criptografar(String mensagem, int k) {
        String resultado = "";

        /*A: 65
          Z: 90
          a: 97
          z: 122*/
        for (char ch : mensagem.toCharArray()) {

            int antigo = (int) ch;
            int atual = antigo;

            if (antigo >= 65 && antigo <= 90) { //Se for letra maiúscula
                atual = (int) (ch + k);
                if (atual > 90) { //Se passar de z
                    atual = (atual - 90 - 1) + 97;
                }
                System.out.println("Antigo:" + (char) antigo + " Novo:" + (char) atual);
            } else if (antigo >= 97 && antigo <= 122) { //Se for letra minúscula
                atual = (int) (ch + k);
                if (atual > 122) { //Se passar de z
                    atual = (atual - 122 - 1) + 97;
                }
                System.out.println("Antigo:" + (char) antigo + " Novo:" + (char) atual);
            }

            resultado += (char) atual;
        }

        return resultado;
    }
}
