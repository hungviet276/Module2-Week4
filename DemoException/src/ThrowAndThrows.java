import java.io.File;
import java.io.FileNotFoundException;

public class ThrowAndThrows {
    public static void divide(int a, int b){
        if (b==0){
            throw new ArithmeticException("divide by zero");
        }
    }
    public static void readFile(String path) throws FileNotFoundException,ArrayIndexOutOfBoundsException {
        File file = new File(path);
        if (!file.exists()){
            throw new FileNotFoundException();
        }
    }


    public static void main(String[] args) {

           divide(2,1);
        try {
            readFile("hung");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
