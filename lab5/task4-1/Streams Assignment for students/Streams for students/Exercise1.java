import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;




public class Exercise1 {

   public static void main(String[] args) {
      CountryDao countryDao= InMemoryWorldDao.getInstance();
      //write your answer here
       List<City> highPopulatedCitiesOfCountries = countryDao.findAllCountries()
                .stream()
                .map( country -> country.getCities().stream().max(Comparator.comparing(City::getPopulation))) //return an empty Optional if the stream of cities is empty for a given country.
                .filter(Optional::isPresent) //This line filters out any empty Optional objects from the stream
                .map(Optional::get) //This line maps each Optional<City> object in the stream to its underlying City object
                  .collect(Collectors.toList());
      highPopulatedCitiesOfCountries.forEach(System.out::println);
   }

}