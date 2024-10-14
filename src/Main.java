import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a palavra que será codificada: ");
        String word = sc.next();

        String [] wordArray = new String [word.length()];

        for (int i = 0; i < word.length(); i++) {
            wordArray[i] = String.valueOf(word.charAt(i));
            System.out.println(wordArray[i]);
//            System.out.println( (int)wordArray[i].charAt(0) );
        }


    }
}