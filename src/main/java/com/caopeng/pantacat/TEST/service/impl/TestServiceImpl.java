package com.caopeng.pantacat.TEST.service.impl;

import com.caopeng.pantacat.TEST.Dao.TestDao;
import com.caopeng.pantacat.TEST.Dto.TestDto;
import com.caopeng.pantacat.TEST.service.PaginationService;
import com.caopeng.pantacat.TEST.service.TestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl extends PaginationService implements TestService {

    @Autowired
    TestDao testDao;

    @Override
    public List<Map> testa() {
        Map<String,String> a = new HashMap();
        testDao.testa().stream().forEach(b -> {
            a.put((String)b.get("key"),(String)b.get("value"));
        });
        for(Map.Entry entry:a.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return testDao.testa();
    }

    @Override
    public PageInfo testb(PageInfo pageInfo) {
        paginationBegin(pageInfo);

        List<TestDto> testss = testDao.testc();

        pageInfo = paginationEnd(testss);
        return pageInfo;
    }
}
