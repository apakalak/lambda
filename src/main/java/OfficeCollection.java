import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OfficeCollection {
    private List<Office> offices;

    public OfficeCollection(List<Office> offices){
        this.offices = offices;
    }

    public List<Office> getOfficesInaLocation(String location){
        return this.offices.stream().filter(item -> (item.getLocation()).toLowerCase().equals(location.toLowerCase())).collect(Collectors.toList());
    }

    public List<Office> getOfficesWithLessEmployees(int count) {
        return this.offices.stream().filter(item -> item.getNumberOfEmployees() < count).collect(Collectors.toList());
    }

    public List<Office> getOfficesWithMoreEmployees(int count){
        return this.offices.stream().filter(item -> item.getNumberOfEmployees() > count).collect(Collectors.toList());
    }

    public List<Office> getOfficesWithName(String name){
        return this.offices.stream().filter( item -> item.getName().equals(name)).collect(Collectors.toList());
    }
    public List<Office> getOfficesWithbeginsCharRange(char rangeBegin, char rangeEnds){
        int asciiBegin = (int)rangeBegin;
        int asciiEnd = (int)rangeEnds;
        return this.offices.stream().filter(item -> {
                    int asciiChar = (int)item.getName().charAt(0);
                    return asciiChar >= asciiBegin && asciiChar <= asciiEnd;
                }).collect(Collectors.toList());
    }

    public List<Office> getOfficesWithNameBeginingWithVowelOrHasLessEmployees(int count){
        Character[] vowels = {'a','e','i','o','u'};
        return this.offices.stream().filter(item -> {
            char firstChar = Character.toLowerCase(item.getName().charAt(0));
            return Arrays.asList(vowels).contains(firstChar) || item.getNumberOfEmployees() < count;
        }).collect(Collectors.toList());
    }

}
