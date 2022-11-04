package com.wms.common;

import lombok.Data;

/**
 * @Author: bo
 * @DATE: 2022/11/4 9:19
 **/
@Data
public class QueryPageParam {
    private static int PAGE_NUM;
    private static int PAGE_SIZE;

    private int pageNum = PAGE_NUM;
    private int pageSize = PAGE_SIZE;
}
