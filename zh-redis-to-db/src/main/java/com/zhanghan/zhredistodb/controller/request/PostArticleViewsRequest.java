/*
 * Copyright (c) 2020. zhanghan_java@163.com All Rights Reserved.
 * 项目名称：Spring Boot实战解决高并发数据入库: Redis 缓存+MySQL 批量入库
 * 类名称：PostArticleViewsRequest.java
 * 创建人：张晗
 * 联系方式：zhanghan_java@163.com
 * 开源地址: https://github.com/dangnianchuntian/springboot
 * 博客地址: https://zhanghan.blog.csdn.net
 */

package com.zhanghan.zhredistodb.controller.request;


import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("文章统计")
@Data
public class PostArticleViewsRequest {

    @ApiModelProperty(value = "用户编码")
    @NotNull
    private String customerId;

    @ApiModelProperty(value = "文章编码")
    @NotNull
    private String articleNo;

    public PostArticleViewsRequest() {
    }
}
