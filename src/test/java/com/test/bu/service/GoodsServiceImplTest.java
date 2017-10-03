package com.test.bu.service;

import com.test.bu.config.JpaConfigTest;
import com.test.bu.config.SpringConfig;
import com.test.bu.entity.Goods;
import com.test.bu.service.interfaces.GoodsService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class, JpaConfigTest.class})
public class GoodsServiceImplTest {

    @Mock
    @Autowired
    private GoodsService goodsService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getById() throws Exception {
        Goods goods = new Goods();
        goods.setName("name1");
        when(goodsService.getById(anyInt())).thenReturn(goods);

        Goods byId = goodsService.getById(5);
        assertEquals("name1", byId.getName());

        verify(goodsService).getById(5);

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