import java.io.*;
public class BufferedReader {
    public static void main(String[] args) throws IOException {
        int ch;
        FileReader R1=new FileReader("MyFile.txt");
        BufferedReader bf= new BufferedReader(new FileReader("MyFile4.txt"));
while((ch=bf.Read())!=-1){
    System.out.print((char)ch);
}
bf.close();
    }
    
}