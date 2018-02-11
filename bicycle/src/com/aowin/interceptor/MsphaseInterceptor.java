package com.aowin.interceptor;

import com.aowin.pojo.Msphase;
import com.aowin.pojo.SyRole;
import com.aowin.pojo.SyUser;
import com.aowin.service.MsphaseService;
import com.aowin.service.SyRoleService;
import com.aowin.service.SyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


public class MsphaseInterceptor implements HandlerInterceptor {

    @Autowired
    SyRoleService syRoleServiceImpl;
    @Autowired
    SyUserService syUserServiceImpl;
    @Autowired
    MsphaseService msphaseServiceImpl;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        SyUser syUser = (SyUser) session.getAttribute("syUser");
        String uri = httpServletRequest.getRequestURI();
        if (uri.indexOf("/user/log") >= 0) {
            return true;
        }
        SyRole syRole = syRoleServiceImpl.findSyRoleByRoleId(syUser.getRoleId());
        List<Msphase> msphases = msphaseServiceImpl.findMsphasesBySyRole(syRole);
        for (Msphase msphase:msphases){
            if (uri.indexOf(msphase.getUrl()) >= 0){
                return true;
            }
        }

        session.setAttribute("error", "权限不足");
        httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(httpServletRequest, httpServletResponse);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
