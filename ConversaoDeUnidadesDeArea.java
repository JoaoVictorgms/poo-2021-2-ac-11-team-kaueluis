import java.util.Scanner;

public class ConversaoDeUnidadesDeArea{  
    public static void main(String[] args) {
      int num;
      Scanner entrada;
      int centimetros = 929;
      int pequadrado = 1;
      double metro = 1;
      int milha = 1;
      double acre = 1;

      entrada = new Scanner(System.in);

      System.out.print("|---------------------------------------|\n");
      System.out.print("Os valores de conversão são:\n");
      System.out.print("1 metro quadrado = 10.76 pés quadrados\n");
      System.out.print("1 pé quadrado = 929 centímetros quadrados\n");
      System.out.print("1 milha quadrada = 640 acres\n");
      System.out.print("1 acre = 43.560 pés quadrados\n");
      System.out.print("|---------------------------------------|\n\n");

      System.out.println("Digite o valor inteiro a ser convertido:");
      num = entrada.nextInt(); 

      metro = num * 10.76;
      pequadrado = centimetros * num;
      milha =  num * 640;
      acre = num * 43.560;

      System.out.println("\nO seu valor convertido é:\n");
      System.out.print( num + " metro quadrado = " + metro + " pés quadrados\n");
      System.out.print( num + " pé quadrado = " + pequadrado + " centímetros quadrados\n");
      System.out.print( num + " milha quadrada = " + milha + " acres\n");
      System.out.print( num + " acre = " + acre + " pés quadrados\n");
  
  }
}