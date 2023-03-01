import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int codigo;
        int pessoas;
        double consumo = 0;
        double consumoTotal=0;
        double mediaTotal=0;
        double cod1 = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas da pesquisa");
        pessoas = s.nextInt();
        for (int i = 0; i<pessoas; i++) {
            System.out.println("Digite o código");
            codigo = s.nextInt();
            System.out.println("Digite o consumo");
            consumo = s.nextInt();
            if (codigo==1) {
                if(consumo<=40){
                         cod1 = (consumo * 0.15) - 0.2;
                     }else{
                         cod1 = consumo * 0.15;
                     }
                System.out.println("O valor é de " +cod1);
            } else if (codigo == 2) {
                if(consumo<=100){
                        cod1 = (consumo * 0.25) - 0.2;
                }else{
                        cod1 = consumo * 0.25;
                    }
                System.out.println("O valor é de " + cod1);
            }else if (codigo == 3) {
                if(consumo<=200){
                        cod1 = (consumo * 0.10) - 0.2;
                    }else{
                        cod1 = consumo * 0.10;
                    }
                System.out.println("O valor é de " +cod1);
            } else {
                  System.out.println("Código inválido. Digite outro número");
            }
            consumoTotal += consumo;
            mediaTotal = consumoTotal/3;
        }
        System.out.println("O consumo total foi de " +consumoTotal+ " kw");
        System.out.println("A média de consumo foi de " +mediaTotal+ " kw");
    }
}