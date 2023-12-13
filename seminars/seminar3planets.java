// Заполнить список названиями планет Солнечной системф в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке

package seminars; 

import java.util.ArrayList;
import java.util.List;

public class seminar3planets {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Mars");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Pluto");
        planets.add("Earth");
        planets.add("Neptun");
        countPlanet(planets);
    }
    
    public static void countPlanet(List<String> planets) {
        List<String> countPlanet = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (String planet : planets) {
            if (!countPlanet.contains(planet)) {
                countPlanet.add(planet);
                int count = 0;
                for (int i = 0; i < planets.size(); i++) {
                    String currentPlanet = planets.get(i);
                    if (planet.equals(currentPlanet)){
                        count++;
                    }
                    
                }
                builder.append(planet).append(": ").append(count).append("; ");
            }
        }
        System.out.println(builder);
    }
}
