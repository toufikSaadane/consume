package com.amigoscode.examples;

import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class GettingStarted {

  @Test
  void imperativeApproach() throws IOException {
    List<Person> people = MockData.getPeople();
    List<Person> _18ofMinder = people.stream().filter(person -> person.getAge() <= 18)
            .limit(10)
                .collect(Collectors.toList());
    _18ofMinder.forEach(System.out::println);

  }
}
