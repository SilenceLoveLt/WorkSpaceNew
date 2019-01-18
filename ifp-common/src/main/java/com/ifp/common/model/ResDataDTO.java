package com.ifp.common.model;

public class ResDataDTO<T> {
    private T data;
    private PageInfo pageInfo;

    public ResDataDTO(T data, PageInfo pageInfo) {
        this.data = data;
        this.pageInfo = pageInfo;
    }

    public ResDataDTO(T date) {
        this.data = date;
    }

    public ResDataDTO() {
    }

    public T getDate() {
        return data;
    }

    public void setDate(T date) {
        this.data = date;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
