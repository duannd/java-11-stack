package com.duannd.java11;

import java.util.Arrays;
import java.util.List;

public class CollectionUtil {

    public static void main(String[] args) {
        List<String> name = List.of("Nguyen", "Dinh", "Duan");
        String[] array = list2Array(name);
        System.out.println(Arrays.toString(array));
    }

    public static String[] list2Array(List<String> list) {
        return list.toArray(new String[0]);
    }

}
