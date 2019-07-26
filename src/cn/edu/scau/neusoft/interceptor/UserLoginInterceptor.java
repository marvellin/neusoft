package cn.edu.scau.neusoft.interceptor;

import cn.edu.scau.neusoft.po.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserLoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("login.....preHandle");
        String url=httpServletRequest.getRequestURI();
        if (url.indexOf("/login") >= 0) {
            return true;
        }
        HttpSession session=httpServletRequest.getSession();
        User user=(User)session.getAttribute("USERNAME");
        if (user != null) {
            return true;
        }
        httpServletRequest.setAttribute("msg", "你还没有登陆，请登陆！");
        httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(httpServletRequest, httpServletResponse);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("login.....postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("login.....afterHandle");
    }
}
