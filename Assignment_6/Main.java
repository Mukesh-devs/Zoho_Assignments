package Assignment_6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1. Book object
        Book book1 = new Book(123456789);
        book1.setTitle("Java Complete Reference");
        book1.setAuthor("James Gosling");
        book1.setPrice(1200);
        System.out.println(book1.showBook());
        System.out.println("Book count : " + Book.bookCount);

        // 2. Employee object
        Employee employee = new Employee("Alice Johnson", "alice.johnson@example.com", "123-456-7890", "Engineering");
        System.out.println(employee);

        // 3. Flight object
        Flight flight = new Flight(101);
        flight.setAirline("Air India");
        flight.setSource("New Delhi");
        flight.setDestination("Mumbai");
        flight.setDepartureTime(LocalDateTime.of(2025, 3, 15, 10, 30));
        flight.setArrivalTime(LocalDateTime.of(2025, 3, 15, 12, 30));
        flight.setPrice(5000.0);
        flight.setSeatCapacity(150);
        System.out.println(flight);

        // 4. Movie object
        Movie movie = new Movie("Goat", "Action", "Vp", (short) 9, 148, LocalDate.of(2024, 7, 16), Arrays.asList("Vijay","Meenakshi"));
        System.out.println(movie);
        
        // 5a. Player object
        Player player1 = new Player("John Doe", "Forward", 10);
        Player player2 = new Player("Jane Smith", "Goalkeeper", 1);
        Player player3 = new Player("Mike Brown", "Defender", 5);
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        // 5b. Team object with players
        Team team = new Team("Warriors", "New York", "East Division", players);
        System.out.println(team);
    }
}
