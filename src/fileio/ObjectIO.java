package fileio;
//24.1.15

import java.io.*;
import java.util.Optional;

public class ObjectIO {

    public static long savePerson(String fileName, Person person) throws IOException {
        try( FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {
        oos.writeObject( person );
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        File file = new File(fileName);
        return file.length();
    }

    public static Optional<Person> loadPerson(String fileName) throws IOException, ClassNotFoundException {
        try( FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person person = (Person) ois.readObject();
            return Optional.of(person);

        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }

        // return null;  // null 체크 중요(잘못하면 runtime 에러 발생-> exception 상황발생 가능성)
        return Optional.empty();
    }

    //24.1.17 // 개발도구 : 리엑트/플루터
    public static long saveFamily(String fileName, Family<Person> fam) throws IOException {
        try( FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(fam);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        File file = new File(fileName);
        return file.length();
    }

    public static Optional<Family<Person>> loadFamily(String fileName) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Family<Person> fam = (Family<Person> ois.readObject());
            return Optional.ofNullable(fam);

        } catch (IOException | ClassNotFoundException e) {
            throw e;
        }
    }

    }





