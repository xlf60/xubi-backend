package com.yupi.springbootinit.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.yupi.springbootinit.model.entity.Chart;
import com.yupi.springbootinit.service.ChartService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ChartMapperTest {

    @Resource ChartMapper chartMapper;

    @Resource
    private ChartService chartService;
    @Test
    void queryChartData() {

        String querySql = "select * from  chart_1692090393414332417";
        List<HashMap<String, Object>> resultData = chartMapper.queryChartData(querySql);
        System.out.println(resultData);
    }

    @Test
    void demo(){

        Chart chart = new Chart();
        chart.setName("name");
        chart.setGoal("goal");
//        chart.setChartData(csvData);
        chart.setChartType("chartType");
        chart.setGenChart("genChart");
        chart.setGenResult("genResult");
        Date date = new Date();
        System.out.println(date.toString());
        chart.setCreateTime(date);
        chart.setUserId(1691451932751663105L);
//        chartService.save(chart);
//        Long id = chart.getId();
//        System.out.println("id:     " + id);
//        Chart one = chartService.lambdaQuery().eq(Chart::getUserId, 1691451932751663105L).eq(Chart::getCreateTime,date).select().one();
//        System.out.println(one);
//        Date nowDate = new Date();
//        chart.setCreateTime(nowDate);
//       chartService.save(chart);
//
//        Chart one = chartService.lambdaQuery().eq(Chart::getUserId, 1691451932751663105L).eq(Chart::getCreateTime, nowDate).select().one();
//        System.out.println(one);
    }
}