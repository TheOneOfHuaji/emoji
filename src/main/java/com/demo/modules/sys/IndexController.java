package com.demo.modules.sys;

import com.jfinal.core.Controller;

/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * IndexController
 */
public class IndexController extends Controller {
	public void index() {
		render("/WEB-INF/modules/sys/index.html");
	}
	
	public void picture() {
		render("/WEB-INF/modules/sys/picture.html");
	}
	
	public void about() {
		render("/WEB-INF/modules/sys/about.html");
	}
	
	public void contact() {
		render("/WEB-INF/modules/sys/contact.html");
	}
	
	public void construct() {
		render("/WEB-INF/modules/sys/construct.html");
	}
}



