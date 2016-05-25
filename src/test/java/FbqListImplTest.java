

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import services.IFbqList;
import type.Fbq;


import java.util.List;

/**
 * Created by Eric on 25/05/2016.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-config.xml" })
public class FbqListImplTest {

    @Autowired
    private IFbqList iFbqList;

    @Test
    public void test_calculteNumber_Should_Test_The_fonctional_method() {
        // Given
        Integer maxNumber = 100;

        // When
        List<Fbq> results = iFbqList.calculateALL(maxNumber);

        // Then

        assertThat(results).isNotNull();
        assertThat(results).isNotEmpty();
        assertThat(results).hasSize(maxNumber);
        assertThat(results.get(51)).isNotNull();
        assertThat(results.get(51).getIndex()).isEqualTo(52);
        assertThat(results.get(51).getResult()).isEqualTo("Bar");

        assertThat(results.get(6).getIndex()).isEqualTo(7);
        assertThat(results.get(6).getResult()).isEqualTo("QixQix");
    }

}
