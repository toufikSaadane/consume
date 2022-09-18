package com.amigoscode.examples;


import org.junit.jupiter.api.Test;
import java.util.stream.IntStream;

public class IntStreams {

  @Test
  public void range() throws Exception {
    System.out.println("with int stream exclusive");
    IntStream.range(0, 10).forEach(System.out::println);

    System.out.println("with int stream inclusive");
    IntStream.rangeClosed(0, 10).forEach(System.out::println);
  }

}
