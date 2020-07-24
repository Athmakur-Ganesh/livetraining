package com.example.demo;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.constants.ZuulConstants;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Component
public class CustomPreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		log.info("Pre Filter Run Method Called");
		
		RequestContext ctx = RequestContext.getCurrentContext();
		
		if(ctx.getRequest().getRequestURI().contains("/api/v1")) {
	          ctx.setResponseStatusCode(300);
	          ctx.setResponseBody("New Version v2 is available Use It");
	          ctx.setSendZuulResponse(false);

		}
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return  "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
