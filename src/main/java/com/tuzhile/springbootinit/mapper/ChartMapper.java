package com.tuzhile.springbootinit.mapper;

import com.tuzhile.springbootinit.model.entity.Chart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.HashMap;
import java.util.List;

/**
 * @Entity com.tuzhile
.springbootinit.model.entity.Chart
 */
public interface ChartMapper extends BaseMapper<Chart> {

    List<HashMap<String, Object>> queryChartData(String querySql);

    void creatChartData(String creatSql);

    void insertChartData(String insertSql);

    Integer checkChart(String creatSql);

}




