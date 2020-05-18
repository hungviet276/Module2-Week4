import java.io.*;

public class ReadFileCSV {
    public static void readFile(String path){
        try {
            File fileCSV = new File(path);
            if (!fileCSV.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(fileCSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ="";
            while ((line=bufferedReader.readLine())!=null){
                String[] country = line.split(",");
                System.out.println(country[5]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String path = "file.csv";
        ReadFileCSV readFileCSV = new ReadFileCSV();
        readFileCSV.readFile(path);

    }
}
