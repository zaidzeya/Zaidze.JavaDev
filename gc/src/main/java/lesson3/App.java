package lesson3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws InterruptedException {
        App.start(10000);
    }

    private static void start( int cnt) throws InterruptedException{
        var list = new ArrayList<Integer>();
        while (true){
            for (int i = 0; i < cnt; i++) {
                list.add(i);
            }
            for (int i = 0; i < 5000; i++) {
                list.remove(i);
            }
        }
    }
}

