package com.test.bu.service;

import com.test.bu.dao.interfaces.PaymentDao;
import com.test.bu.entity.Payment;
import com.test.bu.service.interfaces.PaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class PaymentServiceImplTest {

    @Mock
    private PaymentDao paymentDao;

    @Mock
    private PaymentService paymentService = new PaymentServiceImpl();

    @Test
    public void getById() throws Exception {
        Payment payment = new Payment();
        payment.setId(444);

        when(paymentService.getById(anyInt())).thenReturn(payment);

        Payment byId = paymentService.getById(444);

        assertEquals(444, byId.getId());

        verify(paymentService, atLeastOnce()).getById(anyInt());
    }

    @Test
    public void getAll() throws Exception {
    }

    @Test
    public void save() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

}