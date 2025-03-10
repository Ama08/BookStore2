package org.stubbingExcersise;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
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

    @Test
    void test_calculateCircumference_returns22_whenRectangleWithWidth3AndLength8PassedIn() {
        Rectangle mockRectangle = Mockito.mock(Rectangle.class);
        RectangleStatistics rectangleStatistics = new RectangleStatistics();

        when(mockRectangle.getWidth()).thenReturn(3);
        when(mockRectangle.getLength()).thenReturn(8);

        int circumference = rectangleStatistics.calculateCircumference(mockRectangle);

        assertEquals(22, circumference);

    }

    @Test
    void test_calculateCircumference_returns60_whenRectangleWithWidth10AndLength20PassedIn() {
        Rectangle mockRectangle = Mockito.mock(Rectangle.class);
        RectangleStatistics rectangleStatistics = new RectangleStatistics();

        when(mockRectangle.getWidth()).thenReturn(10);
        when(mockRectangle.getLength()).thenReturn(20);

        int circumference = rectangleStatistics.calculateCircumference(mockRectangle);

        assertEquals(60, circumference);

    }
}
