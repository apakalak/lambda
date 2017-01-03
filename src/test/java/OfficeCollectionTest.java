import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 03/01/17.
 */
public class OfficeCollectionTest {

    @Test
    public void getOfficesInaLocation(){

        List<Office> offices = new ArrayList<Office>();
        offices.add(new Office("Allstate","Banglore",10));
        offices.add(new Office("Allstate","Pune",100));
        offices.add(new Office("AllstateIndia","Universe",1000));
        offices.add(new Office("Google","Banglore",1000));
        offices.add(new Office("Yahoo","pune",785));
        offices.add(new Office("Cybage","Pune",125));
        OfficeCollection oc = new OfficeCollection(offices);

        List<Office> result = oc.getOfficesInaLocation("Pune");
        assertEquals(result.size(),3);
    }

    @Test
    public void getOfficesWithLessThan10Employees(){

        List<Office> offices = new ArrayList<Office>();
        offices.add(new Office("Allstate","Banglore",10));
        offices.add(new Office("Allstate","Pune",2));
        offices.add(new Office("AllstateIndia","Universe",43));
        offices.add(new Office("Google","Banglore",7));
        offices.add(new Office("Yahoo","pune",87));
        offices.add(new Office("Cybage","Pune",4));

        OfficeCollection oc = new OfficeCollection(offices);

        List<Office> result = oc.getOfficesWithLessEmployees(10);
        assertEquals(result.size(),3);
    }

    @Test
    public void getOfficesWithGreaterThen100Employees(){

        List<Office> offices = new ArrayList<Office>();
        offices.add(new Office("Allstate","Banglore",10));
        offices.add(new Office("Allstate","Pune",100));
        offices.add(new Office("AllstateIndia","Universe",1000));
        offices.add(new Office("Google","Banglore",1000));
        offices.add(new Office("Yahoo","pune",785));
        offices.add(new Office("Cybage","Pune",125));
        OfficeCollection oc = new OfficeCollection(offices);

        List<Office> result = oc.getOfficesWithMoreEmployees(100);
        assertEquals(result.size(),4);
    }

    @Test
    public void getOfficesWithName(){

        List<Office> offices = new ArrayList<Office>();
        offices.add(new Office("Allstate","Banglore",10));
        offices.add(new Office("Allstate","Pune",100));
        offices.add(new Office("AllstateIndia","Universe",1000));
        offices.add(new Office("Google","Banglore",1000));
        offices.add(new Office("Yahoo","pune",785));
        offices.add(new Office("Cybage","Pune",125));
        OfficeCollection oc = new OfficeCollection(offices);

        List<Office> result = oc.getOfficesWithName("Allstate");
        assertEquals(result.size(),2);
    }

    @Test
    public void getOfficesNameBeginsWithAtoK(){

        List<Office> offices = new ArrayList<Office>();
        offices.add(new Office("Allstate","Banglore",10));
        offices.add(new Office("Allstate","Pune",100));
        offices.add(new Office("AllstateIndia","Universe",1000));
        offices.add(new Office("Google","Banglore",1000));
        offices.add(new Office("Yahoo","pune",785));
        offices.add(new Office("Cybage","Pune",125));
        OfficeCollection oc = new OfficeCollection(offices);

        List<Office> result = oc.getOfficesWithbeginsCharRange('A','K');
        assertEquals(result.size(),5);
    }

    @Test
    public void getOfficesNameBeginsWithVowelsOrHasLessThan15Employees(){

        List<Office> offices = new ArrayList<Office>();
        offices.add(new Office("Allstate","Banglore",10));
        offices.add(new Office("Allstate","Pune",100));
        offices.add(new Office("AllstateIndia","Universe",1000));
        offices.add(new Office("Google","Banglore",1000));
        offices.add(new Office("Yahoo","pune",4));
        offices.add(new Office("Cybage","Pune",125));
        OfficeCollection oc = new OfficeCollection(offices);

        List<Office> result = oc.getOfficesWithNameBeginingWithVowelOrHasLessEmployees(15);
        assertEquals(result.size(),4);
    }

}