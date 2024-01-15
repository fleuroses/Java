package fileio;
//24.1.15

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryIO {

    public static void copy(String original, String dest) {
        byte[] buffer = new byte[1024];
        try (FileInputStream fis = new FileInputStream(original);
             FileOutputStream fos = new FileOutputStream(dest)) {
            int readBytes;
            while ((readBytes = fis.read(buffer)) != -1 ) {
                //
                fos.write(buffer, 0, readBytes);
            }
        } catch ( IOException e ) {
            System.out.println("파일 복사 중에 오류가 발생했습니다.");

        }

        // 교재 파일입출력 492p 스캐너는 인풋스트림 중 하나, stream.in는 인풋스트림의 객체
        // 스트림 : 데이터를 흘려보내는 형태, 데이터 흐름 vs  스트링

    }
}
