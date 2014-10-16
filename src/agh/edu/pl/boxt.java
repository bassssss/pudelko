package agh.edu.pl;

/**
 * Created by student11 on 2014-10-16.
 */
public class boxt<T> {
    private T t;
    public void add(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
}