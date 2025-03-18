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
        System.out.println(book1); 

        // 2. Employee object
        Employee employee = new Employee();
        employee.setName("Cooper");
        employee.setEmail("cooper@zoho.com");
        employee.setPhone("9878675641");
        employee.setDept("Engineering");
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
        Movie movie = new Movie("The Goat");
        movie.setTitle("The Goat");
        movie.setGenre("Drama");
        movie.setDirector("John Doe");
        movie.setRating((short) 8);
        movie.setDuration(150);
        movie.setReleaseDate(LocalDate.of(2024, 8, 20));
        movie.setCast(Arrays.asList("Actor1", "Actor2"));
        System.out.println(movie);
        
        // 5a. Player object
        Player player1 = new Player("Dhoni", "wicket keeper", 10);
        Player player2 = new Player("Jadeja", "Allrounder", 1);
        Player player3 = new Player("Virat Kholi", "Batsman", 5);
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        // 5b. Team object with players
        Team team = new Team("CSK", "Chennai", "India", players);
        System.out.println(team);
    }
}
