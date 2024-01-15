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




}
