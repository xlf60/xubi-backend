package com.tuzhile.springbootinit.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xulongfei
 * @date 2023/8/16 14:50
 */
@Data
public class GenChartByAiRequest implements Serializable {

    /**
     *  名称
     */
    private String name;

    /**
     * 分析目标
     */
    private String goal;

    /**
     * 图表类型
     */
    private String chartType;


    private static final long serialVersionUID = 1L;
}
