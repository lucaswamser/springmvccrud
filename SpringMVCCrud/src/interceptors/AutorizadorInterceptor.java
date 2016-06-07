package interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AutorizadorInterceptor extends HandlerInterceptorAdapter {

	  @Override
	  public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object controller) throws Exception {
	    String uri = request.getRequestURI();
	    if (uri.endsWith("Usuario/login") || uri.contains("plugin"))
	    	return true;
	  	if(request.getSession().getAttribute("usuarioLogado") != null)
	        return true;
	    response.sendRedirect(request.getContextPath()+"/Usuario/login");
	    return false;  
	  
	  }
	  
	  @Override
		public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
				ModelAndView modelAndView) throws Exception {
			if (modelAndView != null) {
				modelAndView.addObject("usuario", request.getSession().getAttribute("usuarioLogado"));
	        }
	  }
	}