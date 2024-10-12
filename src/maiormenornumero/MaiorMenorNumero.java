package maiormenornumero;
import java.util.Scanner; //Importando a biblioteca scanner

public class MaiorMenorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Programa para descobrir o maior e menor número");
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Informe o primeiro número: "); // Solicitando o primeiro número
    int num1 = Scanner.nextInt();
    System.out.println("Informe o segundo número: "); // Solicitando o segundo número
    int num2 = Scanner.nextInt();
    System.out.println("Informe o terceiro número: "); // Solicitando o terceiro número
    int num3 = Scanner.nextInt();
    System.out.println("----------------------------------------------");
    //IF ELSE para validar qual é o maior número
    if (num1>num2 && num1>num3){
        System.out.println("O mair número é o número: " + num1);
    } else if (num2>num1 && num2>num3){
        System.out.println("O mair número é o número: " + num2);
    }else{
        System.out.println("O maior número é o número: " + num3);
    }
    //IF ELSE para validar qual é o menor número
    if (num1<num2 && num1<num3){
        System.out.println("O mair número é o número: " + num1);
    } else if (num2<num1 && num2<num3){
        System.out.println("O mair número é o número: " + num2);
    }else{
        System.out.println("O maior número é o número: " + num3);
    }
    
}
}