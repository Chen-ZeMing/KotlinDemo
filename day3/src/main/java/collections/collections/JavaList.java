package collections.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class JavaList {
    List<String> stringList = new ArrayList<>();
    List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3));

    class Demo {
        public Demo demo;

        public void main(String args[]) {
            JavaList myList = new JavaList();

            for (int i = 0; i < 10; i++) {
                stringList.add("num:" + i);
            }
            System.out.println(stringList);

            demo = new Demo();
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Hello",10);
            System.out.println(map.get("Hello"));
        }

    }




}
