package org.stubbingExcersise;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestRectangleStatistic {

    @Test
    public void test_CalculateArea_whenWidthEqualsfour_andLengthEqualsFive(){
        Rectangle mockRectangle = Mockito.mock(Rectangle.class);
        RectangleStatistics rectangleStatistics = new RectangleStatistics();

        when(mockRectangle.getWidth()).thenReturn(4);
        when(mockRectangle.getLength()).thenReturn(5);

        int area = rectangleStatistics.calculateArea(mockRectangle);

        assertEquals(20, area);
    }

    @Test
    public void test_CalculateArea_whenWidthEquals_anFivedLengthEqualsSeven(){
        Rectangle mockRectangle = Mockito.mock(Rectangle.class);
        RectangleStatistics rectangleStatistics = new RectangleStatistics();

        when(mockRectangle.getWidth()).thenReturn(5);
        when(mockRectangle.getLength()).thenReturn(7);

        int area = rectangleStatistics.calculateArea(mockRectangle);

        assertEquals(35, area);
    }

}
