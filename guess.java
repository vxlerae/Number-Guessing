import java.util.*;

public class guess{
    public static void main(String[] args){
        Random rand = new Random();
        int correct = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean win = false;
        while(win ==false){
            
            System.out.println("Guess the number!");
            num = scanner.nextInt();

            if(num>correct){
                System.out.println("Too High!!!");
            }
            else if(num<correct){
                System.out.println("Too Low!!!");
            }

            else if(num==correct){
                System.out.println("Thats Correct!!!!!! You Win!!!!");
                win = true;

            }
        }

    }

}