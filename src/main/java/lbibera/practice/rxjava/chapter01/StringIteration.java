package lbibera.practice.rxjava.chapter01;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

/**
 * Iterate through a List of String without looping
 */
public class StringIteration {

    public static void main(String...args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");

        Observable<String> observable = Observable.fromIterable(list);
        observable.subscribe(System.out::println);
    }
}
