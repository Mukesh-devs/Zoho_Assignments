package Assignment_6;

import java.util.List;

public class Team {

    private String name;
    private String city;
    private String country;
    private List<Player> players; 
    public static int teamCount;


    public Team(String name, String city, String country, List<Player> players) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.players = players;
        teamCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        StringBuilder playersNames = new StringBuilder();
        for (Player player : players) {
            playersNames.append(player.toString()).append(", ");
        }
        return "name \t: " + name +
                "\ncity \t: " + city +
                "\ndivision \t: " + country +
                "\nplayers \t: " + playersNames;
    }
}
