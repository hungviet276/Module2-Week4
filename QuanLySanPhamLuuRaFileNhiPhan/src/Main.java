import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    String filePath = "student.dat";

    Product product1 = new Product("001","N95","Nokia",1000);
    Product product2 = new Product("002","IP7","Apple",2000);
        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(product1);
        arrayList.add(product2);
        File file = new File(filePath);

        writeObject(file,arrayList);
        ArrayList<Product> newArray = new ArrayList<>();
        readObject(file);







    }
    public static void writeObject(File file,ArrayList arrayList){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(arrayList);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readObject(File file){
        try {

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Product> newArray = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
            for (Object product:newArray
                 ) {
                System.out.println(product.toString());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
