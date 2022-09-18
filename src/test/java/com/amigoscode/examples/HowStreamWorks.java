package com.amigoscode.examples;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HowStreamWorks {

  @Test
  public void how(){
    String[] names = {"Ilias", "Toufik", "Esther"};
    List<String> namesList = Arrays.stream(names).toList();
    System.out.println( namesList.stream().count());

  }
}
