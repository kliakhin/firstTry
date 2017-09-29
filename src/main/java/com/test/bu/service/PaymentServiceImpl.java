package com.test.bu.service;

import com.test.bu.dao.interfaces.PaymentDao;
import com.test.bu.entity.Payment;
import com.test.bu.service.interfaces.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Payment getById(int id) {
        return paymentDao.getById(id);
    }

    @Override
    public Collection<Payment> getAll() {
        return paymentDao.getAll();
    }

    @Override
    public void save(Payment payment) {
        paymentDao.save(payment);
    }

    @Override
    public void delete(int id) {
        paymentDao.delete(paymentDao.getById(id));
    }

    @Override
    public void update(Payment payment) {
        paymentDao.update(payment);
    }
}
