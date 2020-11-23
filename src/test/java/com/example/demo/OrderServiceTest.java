package com.example.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.junit.Assert.assertEquals;


@RunWith(PowerMockRunner.class)
@PrepareForTest(Util.class)
public class OrderServiceTest {

    @Mock
    OrderDao dao;

    @InjectMocks
    OrderService svc;

    @Test
    public void testAddOrder(){
         Order order = new Order("hello");
         PowerMockito.mockStatic(Util.class);
        PowerMockito.when(dao.addOrder(order)).thenReturn(1);
        PowerMockito.when(Util.sayHello("hello")).thenReturn("Hello123");
        int actual = svc.addOrder(order);
        assertEquals(1,actual);
    }

    @Test
    public void  testOrderNegative(){
        Order order = new Order("book");
        Mockito.when(dao.addOrder(order)).thenReturn(0);
        int actual = svc.addOrder(order);
        assertEquals(0,actual);
    }


}
