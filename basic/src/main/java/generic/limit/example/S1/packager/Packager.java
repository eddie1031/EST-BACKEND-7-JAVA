package generic.limit.example.S1.packager;

import generic.limit.example.S1.Portable;
import generic.limit.example.S1.box.Box;

public class Packager<T> {

    public static void closePortableBox(Box<? extends Portable> box) {
        box.close();
    }

    // Installable
    public void close(Box<T> box) {
        box.close();
    }

    public static void closeBox(Box<?> box) {
        box.close();
    }

}
