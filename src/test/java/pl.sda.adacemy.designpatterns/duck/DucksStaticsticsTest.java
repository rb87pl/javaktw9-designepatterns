package pl.sda.adacemy.designpatterns.duck;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class DucksStaticsticsTest {
    //@Test

    //public void shouldAcceptDuckListAsParameter(){
    //    //given
    //    List<Duck> ducks = new ArrayList<>();
    //    //when
    //    new DucksStaticstics(ducks);
    //    //then
    //    //nothing
    //}

    @Test
    public  void  shouldReturnOldestDuck() {
        //given
        Duck duck1 = mock(Duck.class);
        when(duck1.age()).thenReturn(15);

        Duck oldestDuck = mock(Duck.class);
        doReturn(555).when(oldestDuck).age();
        //

    }
}
