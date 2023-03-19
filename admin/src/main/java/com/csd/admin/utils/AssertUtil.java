package com.csd.admin.utils;

import com.csd.admin.exceptions.ParamsException;

/**
 * ClassName:{AssertUtil}
 * Package:{com.csd.admin.utils}
 * Description:
 *
 * @Date:2023-03-19 15:37
 * @Author:
 */
public class AssertUtil {


    public  static void isTrue(Boolean flag,String msg){
        if(flag){
            throw  new ParamsException(msg);
        }
    }

}