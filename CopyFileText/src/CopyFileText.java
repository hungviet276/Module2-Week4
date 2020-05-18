import java.io.*;

public class CopyFileText {
    public void copyFile(String source,String target){
        String sourcePath = source;
        String targetPath = target;
        try {
            File sourceFile = new File(sourcePath);
            File targetFile = new File(targetPath);
            if (!sourceFile.exists() || !targetFile.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile));
            String line = "";
            int sumChar = 0;
            while ((line=bufferedReader.readLine())!=null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                for (int i = 0; i < line.length();i++){
                    sumChar+=1;
                }
            }
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("So ky tu la: " + sumChar);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
       CopyFileText copyFileText = new CopyFileText();
       copyFileText.copyFile("SourceFile.txt","TargetFile.txt");
    }
}
