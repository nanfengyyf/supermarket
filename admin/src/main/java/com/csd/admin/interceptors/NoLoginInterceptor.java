package com.csd.admin.interceptors;

import com.csd.admin.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName:{NoLoginInterceptor}
 * Package:{com.csd.admin.interceptors}
 * Description:
 *
 * @Date:2023-03-19 16:17
 * @Author:
 */
public class NoLoginInterceptor  implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        User user= (User) request.getSession().getAttribute("user");

        if(null == user){
            /**
             * 用户未登录 或者 session 过期
             */
            response.sendRedirect("index");
            return false;
        }
        return true;
    }
}
