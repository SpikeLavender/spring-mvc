package com.lagou.edu.mvcframework.pojo;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * 封装handler方法相关的信息
 */

public class Handler {

	private Object controller;

	private Method method;

	private Pattern pattern; //spring中url支持正则

	private Map<String, Integer> paramIndexMapping; //参数顺序，是为了进行参数绑定，key是参数名，value代表是第几个参数<name,2>

	private Set<String> securities; //有权限的用户

	public Handler(Object controller, Method method, Pattern pattern) {
		this.controller = controller;
		this.method = method;
		this.pattern = pattern;
		this.paramIndexMapping = new HashMap<>();
		this.securities = new HashSet<>();
	}

	public Object getController() {
		return controller;
	}

	public void setController(Object controller) {
		this.controller = controller;
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

	public Pattern getPattern() {
		return pattern;
	}

	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}

	public Map<String, Integer> getParamIndexMapping() {
		return paramIndexMapping;
	}

	public void setParamIndexMapping(Map<String, Integer> paramIndexMapping) {
		this.paramIndexMapping = paramIndexMapping;
	}

	public Set<String> getSecurities() {
		return securities;
	}

	public void setSecurities(Set<String> securities) {
		this.securities = securities;
	}
}
