package com.streamsApi.codes;

import java.util.stream.Collectors;

public class RemoveDuplicatesAndReturnSameOrder {
     public static void main (String [] args){

         String input = "programming";

         String result = input.chars().mapToObj(c -> String.valueOf((char)c))
                 .distinct()
                 .collect(Collectors.joining());

         System.out.println("The result is : " + result);


     }


}
