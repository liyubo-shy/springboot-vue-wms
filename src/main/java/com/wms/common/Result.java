package com.wms.common;

import com.sun.org.apache.regexp.internal.RE;
import lombok.Data;

/**
 * @Author: bo
 * @DATE: 2022/11/6 18:18
 **/
@Data
public class Result {
    private int code;
    private String msg;
    private Long total;
    private Object data;

    private static Result result(int code, String msg, Long total, Object data) {
        Result res = new Result();
        res.setCode(code);
        res.setMsg(msg);
        return res;
    }


}
