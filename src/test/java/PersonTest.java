import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

  Person person;

  @BeforeEach
  void setUp() {
    person = new Person("Kesha", "Akimov", 3);
  }

  @Test
  void getName() {
    assertEquals("Kesha", person.getName());
  }

  @Test
  void getSurname() {
    assertEquals("Akimov", person.getSurname());
  }

  @Test
  void getNumberOfTickets() {
    assertEquals(3, person.getNumberOfTickets());
  }

  @Test
  void setNumberOfTickets() {
    int NumberOfTickets = 0;
    NumberOfTickets--;
    assertTrue(NumberOfTickets != 0);
  }
}


