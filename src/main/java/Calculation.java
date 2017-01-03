import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Calculation {
    private List<Float> numbers;

    public Calculation(List<Float> numbers){
        this.numbers = numbers;
    }

    public float getMean(){
        return  this.numbers.stream().reduce((float)0,(acc,val) -> acc + val)/this.numbers.size();
    }

    public float getMedian(){
        int length = this.numbers.size();
        int midIndex = (int)Math.floor(length/2);

        List<Float> nosSorted = this.numbers.stream().sorted().collect(Collectors.toList());

        if(length % 2 == 0 ){
            return (nosSorted.get(midIndex) + nosSorted.get(midIndex - 1))/2;
        }else{
            return nosSorted.get(midIndex);
        }
    }

    public float getMode(){
        HashMap<Float, Integer> mapping = new HashMap<>();

        this.numbers.forEach(i -> {
            if(mapping.get(i) == null){
                mapping.put(i, 1);
            }
            else{
                mapping.put(i, mapping.get(i)+1);
            }
        });

        return mapping.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();
    }

}
