import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        int input = 0;
        for (int i =0; i<3;i++){
            input = getInput();
            System.out.println("Value: " + input);
        }
    }
    public static int getInput(){
        Scanner sc = new Scanner(System.in);
        int value = 0;
        System.out.println("Enter your value: ");
        value = sc.nextInt();
        return value;
    }
}
