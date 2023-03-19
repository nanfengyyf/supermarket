package com.csd.admin;

import com.csd.admin.exceptions.ParamsException;
import com.csd.admin.model.RespBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:{GlobalExceptionHandler}
 * Package:{com.csd.admin}
 * Description:
 *
 * @Date:2023-03-19 16:12
 * @Author:
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ParamsException.class)
    @ResponseBody
    public RespBean paramsExceptionHandler(ParamsException e){
        return  RespBean.error(e.getMsg());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public RespBean exceptionHandler(Exception e){
        return  RespBean.error(e.getMessage());
    }

}