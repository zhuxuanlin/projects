package com.aipark.common.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:      zhuxuanlin
 * Description: API响应内容
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ApiResponse<T> {

    /**
     * 状态码
     */
    private int code = 200;

    /**
     * 提示信息
     */
    private String message = "SUCCESS";

    /**
     * 数据内容
     */
    private T data;

}