import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 03/01/17.
 */
public class CalculationTest {


    @Test
    public void getMean(){

        List<Float> numbers = new ArrayList<Float>();
        numbers.add(new Float(3));
        numbers.add(new Float(1));
        numbers.add(new Float(7));
        numbers.add(new Float(3));
        Calculation cl = new Calculation(numbers);
        assertEquals(cl.getMean(),3.5,0);
    }

    @Test
    public void getMeanWithFloats(){

        List<Float> numbers = new ArrayList<Float>();
        numbers.add(new Float(3.5));
        numbers.add(new Float(1.2));
        numbers.add(new Float(7.8));
        numbers.add(new Float(3.3));
        Calculation cl = new Calculation(numbers);
        assertEquals(cl.getMean(),3.95,0.01);
    }

    @Test
    public void getMedian(){

        List<Float> numbers = new ArrayList<Float>();
        numbers.add(new Float(3));
        numbers.add(new Float(1));
        numbers.add(new Float(7));
        numbers.add(new Float(4));
        numbers.add(new Float(4));
        Calculation cl = new Calculation(numbers);
        assertEquals(cl.getMedian(),4.0,0.01);
    }

    @Test
    public void getMedianWithFloats(){

        List<Float> numbers = new ArrayList<Float>();
        numbers.add(new Float(3.5));
        numbers.add(new Float(1.3));
        numbers.add(new Float(7.6));
        numbers.add(new Float(4.3));
        numbers.add(new Float(4.1));
        numbers.add(new Float(4.2));
        Calculation cl = new Calculation(numbers);
        assertEquals(cl.getMedian(),4.15,0.01);
    }

    @Test
    public void getMode(){

        List<Float> numbers = new ArrayList<Float>();
        numbers.add(new Float(3));
        numbers.add(new Float(1));
        numbers.add(new Float(7));
        numbers.add(new Float(4));
        numbers.add(new Float(4));
        Calculation cl = new Calculation(numbers);
        assertEquals(cl.getMode(),4.0,0.1);
    }
    @Test
    public void getModeWithFloats(){

        List<Float> numbers = new ArrayList<Float>();
        numbers.add(new Float(3.0));
        numbers.add(new Float(1.0));
        numbers.add(new Float(7.0));
        numbers.add(new Float(4.8));
        numbers.add(new Float(4.8));
        Calculation cl = new Calculation(numbers);
        assertEquals(cl.getMode(),4.8,0.1);
    }

}