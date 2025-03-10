package org.stubbingExercise2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestCompanyFinanceCalculator {

   private CompanyFinanceCalculator companyFinanceCalculator;

   @Mock
   private Department mockDepartment;
   @Mock
   private Employee mockEmployee1;
   @Mock
   private Employee mockEmployee2;
   @Mock
   private Employee mockEmployee3;

   @BeforeEach
    void setUp(){
       companyFinanceCalculator = new CompanyFinanceCalculator();
       mockDepartment = Mockito.mock(Department.class);
   }
    @Test
    void test_calculateDepartmentWageBill_returns90k_whenDepartmentWithEmployeesEarning30kAnd60kPassedIn() {

       when(mockEmployee1.getSalary()).thenReturn(30000);
       when(mockEmployee2.getSalary()).thenReturn(60000);

       when(mockDepartment.getAllEmployees()).thenReturn(List.of(mockEmployee1, mockEmployee2));

       int depWgeBill = companyFinanceCalculator.calculateWageBill(mockDepartment);

       assertEquals(90000, depWgeBill);

    }

    @Test
    void test_calculateDepartmentWageBill_returns90k_whenDepartmentWithEmployeesEarning30kAnd60kbAnd40KPassedIn() {

        when(mockEmployee1.getSalary()).thenReturn(30000);
        when(mockEmployee2.getSalary()).thenReturn(60000);
        when(mockEmployee3.getSalary()).thenReturn(40000);

        when(mockDepartment.getAllEmployees()).thenReturn(List.of(mockEmployee1, mockEmployee2, mockEmployee3));

        int depWgeBill = companyFinanceCalculator.calculateWageBill(mockDepartment);

        assertEquals(130000, depWgeBill);

    }








}