package fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextIO {

    public static void write(String fileName, String text) {

        File file = new File(fileName);
        try (FileWriter fWriter = new FileWriter(file)) {
            fWriter.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    // StringBuilder : String보다 메모리 더 효율적
//    StringBuilder sb = new StringBuilder();
//    String str1 = "안녕하세요";
//    String str2 = "안녕하세요";
//    String str3 = "안녕하세요";
//        sb.append(str1);
//        sb.append(str2);
//        sb.append(str3);
//        System.out.println( sb.toString() );
    public static StringBuilder read(String fileName) throws IOException {
        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();
        try(FileReader fReader = new FileReader(file)) {
            // fReader.read(); // 한방에 text file의 모든 내용 읽기
            char[] buffer= new char[128];
            int readBytes;
            while( (readBytes = fReader.read(buffer)) !=-1 ) {
                String str = new String(buffer, 0, readBytes);
                sb.append( str );
            }

        } catch (IOException e) {
            throw e;

        }
        return sb;


    }

}
