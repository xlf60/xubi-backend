package com.yupi.springbootinit.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ChartMapperTest {

    @Resource ChartMapper chartMapper;
    @Test
    void queryChartData() {

        String querySql = "select * from  chart_1692090393414332417";
        List<HashMap<String, Object>> resultData = chartMapper.queryChartData(querySql);
        System.out.println(resultData);

    }
}