package com.caopeng.pantacat.TEST.Dto;


import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TestDto extends PageInfo implements Serializable {

    private String fieldcode;
    private String fileSql;
    private List<TDto> dateList;
}
