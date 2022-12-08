import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

  public static List<Person> generateClients() {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Misha", "Gulyaev", 1));
    persons.add(new Person("Alexsey", "Filatov", 2));
    persons.add(new Person("Kesha", "Akimov", 3));
    persons.add(new Person("Alik", "Kuznecov", 2));
    persons.add(new Person("Dima", "Alekseev", 0));
    return persons;
  }

  public static void main(String[] args) {
    Queue<Person> queue = new LinkedList<>();
    List<Person> people = generateClients();
    for (Person person : people) {
      queue.offer(person);
    }
    while (!queue.isEmpty()) {
      Person person = queue.poll();
      if (person.numberOfTickets <= 0) {
        System.out.println(
            person.getName() + " " + person.getSurname() + " Нет билета");
        continue;
      }
      System.out.println(
          person.getName() + " " + person.getSurname() + " прокатился на аттракционе.");
      person.setNumberOfTickets(person.getNumberOfTickets() - 1);
      if (person.numberOfTickets > 0) {
        queue.offer(person);
      }
    }
  }
}


