import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int score = 0;
        int previousScore = 0;
        int numberOfWords = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String word = scan.nextLine();
        while (score < 50){
            System.out.print("Enter another word: ");
            String currentWord = scan.nextLine();

            if (currentWord.compareTo(word) > 0){
                score += 2;
            }
            else if (currentWord.compareTo(word) == 0){
                score -= 10;
            }
            else if (currentWord.indexOf(word) != -1){
                score += 20;
            }
            else{
                score -= 5;
            }
            if (word.substring(word.length() - 2).equals(currentWord.substring(0, 2))){
                score += 5;
            }
            if (currentWord.indexOf(word.substring(0, 1)) != -1){
                score += 3;
            }
            word = currentWord;
            System.out.println("Points: " + score + " (" + (score - previousScore) + " points)");
            numberOfWords ++;
            previousScore = score;
        }
        System.out.println("It took you " + numberOfWords + " words to reach 50 points");
    }
}