import java.util.Scanner;

public class MediaPonderada{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite três notas: (Trabalho, avaliação, exame final)");

    double nota1 = sc.nextDouble();
    double nota2 = sc.nextDouble(); 
    double nota3 = sc.nextDouble();

    double mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;

    System.out.printf(
      (mediaPonderada >= 8 && mediaPonderada <= 10) ? "Media: %.2f, logo A" :
      (mediaPonderada >= 7 && mediaPonderada <= 8) ? "\nMedia %.2f, logo B" :
      (mediaPonderada >= 6 && mediaPonderada <= 7) ? "\nMedia: %.2f, logo C" :
      (mediaPonderada >= 5 && mediaPonderada <= 6) ? "\nMedia: %.2f, logo D" :
      (mediaPonderada >= 0 && mediaPonderada <= 5) ? "\nMedia: %.2f, logo E" : "Brutal", mediaPonderada
    );

    sc.close();
  }
}
