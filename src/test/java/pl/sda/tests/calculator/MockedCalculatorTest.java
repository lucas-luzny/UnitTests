package pl.sda.tests.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class MockedCalculatorTest {
    private int result;



    @Mock
    Calculator calculator;

    @Before
    public void setup(){
        when(calculator.add(3,5)).thenReturn(9);
    }

    @Test
    public void adding(){
        assertThat(calculator.add(3,5)).isEqualTo(9);

    }
}
