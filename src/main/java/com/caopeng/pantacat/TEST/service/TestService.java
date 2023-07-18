package com.caopeng.pantacat.TEST.service;


import com.caopeng.pantacat.TEST.Dto.TestDto;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface TestService {
    public List<Map> testa();

    public PageInfo testb(PageInfo pageInfo);

}
