package com.bg.xxlJob.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DataSourceConfigTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testDataSourceConfig(){
        assertNotNull(dataSource);
        assertTrue(dataSource instanceof DruidDataSource);
        DruidDataSource druidDataSource = (DruidDataSource) dataSource;
        assertEquals("sa", druidDataSource.getUsername());
        assertEquals("jdbc:h2:mem:dbtest", druidDataSource.getUrl());
    }
}