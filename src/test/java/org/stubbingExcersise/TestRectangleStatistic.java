package org.stubbingExcersise;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestRectangleStatistic {

    @Test
    public void test_CalculateArea(){
        Rectangle mockRectangle = Mockito.mock(Rectangle.class);
        RectangleStatistics rectangleStatistics = new RectangleStatistics();

    }

}
