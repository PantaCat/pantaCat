package com.caopeng.pantacat.TEST.Dao;


import com.caopeng.pantacat.TEST.Dto.TestDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
public interface TestDao  {
    
    public List<Map> testa();
    public String testb(String sqlval);
    public List<TestDto> testc();
    public List<TestDto> testd(TestDto testDto);
}
