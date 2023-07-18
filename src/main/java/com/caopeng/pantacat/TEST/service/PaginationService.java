package com.caopeng.pantacat.TEST.service;

import com.caopeng.pantacat.TEST.Dto.TestDto;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

public class PaginationService<T> {

    private PageInfo pageInfo;

    public void paginationBegin(PageInfo pageInfo) {
        PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        this.pageInfo = pageInfo;
    }

    public PageInfo<T> paginationEnd(List<T> objList) {
        pageInfo.setList(objList);
        return pageInfo;
    }
}
