package com.caopeng.pantacat.Utils;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;

public class PaginationBeanUtils {

    /**
     * @param <T>
     * @param select   调用Mapper接口的结果
     * @param param  请求参数
     * @return
     */
    public static <T> PageInfo generatePage(ISelect select, PageInfo param) {
        Integer current = param.getPageNum();
        Integer pageSize = param.getPageSize();
        List<T> list = PageHelper
                .startPage(current == null ? 1 : current, pageSize == null ? 10 : pageSize)
                .doSelectPage(select);
        return new PageInfo(list);
    }
}
