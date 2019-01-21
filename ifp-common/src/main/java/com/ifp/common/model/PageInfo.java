package com.ifp.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "分页对象", description = "分页查询必传")
public class PageInfo {
    @ApiModelProperty("每页条数")
    private Integer pageSize;
    @ApiModelProperty("页码")
    private Integer pageNum;
    @ApiModelProperty("总条数")
    private Long total;
    @ApiModelProperty("总页数")
    private Integer pageTotal;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }
}
