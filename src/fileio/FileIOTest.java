

package fileio;
//24.1.15

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Optional;

public class FileIOTest {

    public static void main(String[] args) {

        // text file : ansi-code, unicode(utf-8, utf-16, utf-32,...)
        // binary file

        // file을 구현해주는 클래스
//        File file = new File("test.txt");   // 경로는 윈도우는 \\ 두 개 역슬래시로 , 리눅스 : \
//        try {
//            FileWriter fWriter = new FileWriter(file);
//            fWriter.write("안녕하세요");
//            fWriter.close();
//
//        } catch (IOException e) {                   // 예외처리
//            throw new RuntimeException(e);
//        }


//        StringBuilder sb = new StringBuilder();
//        sb.append("test file입니다.\n");
//        sb.append("이것은 java로 만들어진 파일입니다.\n");
//        sb.append("파일 쓰기 및 읽기 작업입니다.\n");
//        TextIO.write("test.txt", sb.toString());


//        try {
//            StringBuilder sb = TextIO.read("test.txt");
//            System.out.println(sb.toString());
//        } catch ( IOException e ) {
//            System.out.println(e.getMessage());
//        }
//
//        BinaryIO.copy("test.txt", "copy.txt");


        Person kang = new Person(20, "강호동", "1234-1234");
        Person yoo = new Person(21, "유재석", "1234-4567");
        Person park = new Person(22, "박명수", "4567-1234");



//        try {
//            ObjectIO.savePerson("kang.per", kang);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        // try 안에 코드들은 제너릭<>
//        try {
//            Optional<Person> byPerson = ObjectIO.loadPerson("kang.per");
//
//            // null 일 경우
//            // if ( person == null) {} else{}
//            byPerson.orElseThrow(() -> new RuntimeException("객체를 정상적으로 로딩하지 못했습니다.")); // 람다식은 함수형인터페이스가 있다는 것
//            Person fileObject = byPerson.get();
//            System.out.println( fileObject );
//
//        } catch (IOException | ClassNotFoundException | RuntimeException e) {
//            System.out.println( e.getMessage() );
//        }

        Family<Person> fam = new Family<>();
//        fam.add( kang );
//        fam.add( yoo );
//        fam.add( park );

//        try {
//            ObjectIO.saveFamily("Person.fam", fam);
//        } catch(IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//
//        //파라미터
//
//        try{
//            Optional<Family<Person>> byFam = ObjectIO.loadFamily("Kang.per");
//            byFam.orElseThrow(() -> new RuntimeException("객체를 정상적으로 로딩하지 못했습니다."));
//            Family<Person> fileObject = byFam.get();
//            fileObject.showItem();
//        } catch (IOException | ClassNotFoundException | RuntimeException e) {
//            System.out.println( e.getMessage() );
//        }



        // 다음시간 교재 부록

        // 숙제
        // 제너릭 말고 클래스 하나 생성 후 person 처럼 Serializable 사용
        // arraylist가 멤버변수로 제너릭으로 person을 상속받아서
        // "kang"이런 것을 넣기
    }



}