package com.imooc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("destroy-----SecondFilter");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("start---doFilter--SecondFilter");
		chain.doFilter(request, response);//放行
//		通常这里会执行一些逻辑，执行完才往下走，考虑到该过程可能耗时，用户一直等结果，所以lservlet3提供了异步处理
		System.out.println("end---doFilter--SecondFilter");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

		System.out.println("init-----SecondFilter");
	}

}
