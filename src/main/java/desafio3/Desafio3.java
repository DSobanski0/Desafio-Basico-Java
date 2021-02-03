package desafio3;

import java.io.IOException;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        if (entrada == 0) {
            System.out.println("E");
        }else if (entrada <= 35){
            System.out.println("D");
        }else if (entrada <= 60){
            System.out.println("C");
        }else if (entrada <= 85){
            System.out.println("B");
        }else{
            System.out.println("A");
        }
    }
}
