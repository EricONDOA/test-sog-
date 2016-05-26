


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import services.IFbqList;
import type.Fbq;

import java.util.List;

import static org.fest.assertions.api.Assertions.*;


/**
 * Created by Eric on 25/05/2016.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-config.xml"})
public class FbqListImplTest {


    @Autowired
    IFbqList iFbqList;

    @Test
    public void test_calculateAll_Should_Return0Result_when_enter_wrong_number(){
       // Given
        Integer number = 0;

       //When
        List<Fbq> results = iFbqList.calculateALL(number);

       //Then
        assertThat(results).isEmpty();

    }

    @Test
    public void test_calculteAll_Should_Test_The_fonctional_method() {
        // Given
        Integer maxNumber = 100;

        // When
        List<Fbq> results = iFbqList.calculateALL(maxNumber);

        // Then
        assertThat(results).isNotNull();
        assertThat(results).isNotEmpty();
        assertThat(results.get(2).getNumber()).isEqualTo(3);
        assertThat(results.get(2).getValue()).isEqualTo("FooFoo");
    }


}
