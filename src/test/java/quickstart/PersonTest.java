package quickstart;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


/**
 * Created by Lucas on 18.07.2017.
 */
@RunWith(JUnitParamsRunner.class)
public class PersonTest {

    @Test
    @Parameters({"17,false", "22,true"})
    public void personIsAdult1(int age, boolean valid)throws Exception{
        assertThat(new Person(age).isAdult(), is(valid));
    }

    @Test
    @Parameters(method = "adultValues")
    public void personIsAdult2(int age, boolean valid) throws Exception{
        assertEquals(valid, new Person(age).isAdult());
    }
    private Object[] adultValues(){
        return new Object[]{
            new Object[]{13, false},
            new Object[]{17, false},
            new Object[]{18,true},
            new Object[]{22, true}
        };
    }

    @Test
    @Ignore
    @Parameters
    public void personIsAdult3(int age, boolean valid) throws Exception {
        assertEquals(valid, new Person(age).isAdult());
    }

    private Object[] parametersForPersonIsAdult() {
        return new Object[]{
            new Object[]{13, false},
            new Object[]{17, false},
            new Object[]{18, true},
            new Object[]{22, true}
        };
    }

    @Test
    @Parameters
    public void isAdult(Person person, boolean valid) throws Exception{
        assertThat(person.isAdult(), is(valid));
    }

    private Object[] parametersForIsAdult(){
        return new Object[]{
            new Object[]{new Person(13), false},
            new Object[]{new Person(17), false},
            new Object[]{new Person(18), true},
            new Object[]{new Person(22), true}
        };
    }

    @Test
    @Parameters(source = PersonProvider.class)
    public void personIsAdult(Person person, boolean valid){
        assertThat(person.isAdult(), is(valid));
    }

}
