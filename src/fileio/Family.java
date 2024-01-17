package fileio;

import java.io.Serializable;
import java.util.ArrayList;

public class Family <T> implements Serializable {
    private final ArrayList<T> list = new ArrayList<T>();

    public Family() {


    }

    private int add(T obj) {
        list.add( obj );
        return list.size();

    }

    public void showItem() {
        for(T obj : list) {
            System.out.println(obj);
        }
    }


}
