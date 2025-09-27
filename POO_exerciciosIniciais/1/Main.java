import java.util.Scanner;

public class Main {
    static public void main(String args[]){
        System.out.println("Digite dois números: ");
        Scanner sc = new Scanner(System.in);

        int maior, menor;
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2){
            maior = num1;
            menor = num2;
        }else{
            if(num2 > num1){
                maior = num2;
                menor = num1;
            }else{
				maior = menor = num2;
			}
        }

        if (maior != menor){
            System.out.printf("O valor da diferença é %d", maior - menor);
        }else{
			System.out.printf("Os dois números são iguais, logo a diferença é %d", maior - menor);
		}
    
        
        sc.close();
    }
}
