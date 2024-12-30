package org.example.e_streams.streams;

import java.util.List;

public class StrToUppercase {

    public static void main(String[] args) {

        List<String> strList = List.of("wow", "str", "brbrbrbr");

        strList.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
