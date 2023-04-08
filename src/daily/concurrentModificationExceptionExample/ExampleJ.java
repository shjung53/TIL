package concurrentModificationExceptionExample;

import kotlin.jvm.internal.Intrinsics;

import java.util.ArrayList;
import java.util.Iterator;

public final class ExampleJ {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i =0; i<=10; i++) {
            arr.add(i);
        }

        for(Iterator<Integer> iterator = arr.iterator(); iterator.hasNext();) {
            Integer j = (Integer)iterator.next();
            if (Intrinsics.compare(j, 3) > 0) {
                iterator.remove();
            }
        }

    }

}

