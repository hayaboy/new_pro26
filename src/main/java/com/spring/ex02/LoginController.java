package com.spring.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller(value = "loginController")
public class LoginController {
	
	
	//Model
	//모델 속성에 대한 홀더를 정의하는 인터페이스입니다.
	//주로 모델에 속성을 추가하기 위해 설계되었습니다.
	//전체 모델에 java.util.Map으로 액세스할 수 있습니다.
	// Model 클래스의 addAttribute()메서드는 ModelAndView의 addObject()의 메서드와 같은 기능, Model 클래스는 따로 뷰 정보를 전달할 필요가 없을 경우 사용하면 편리
	
//	@RequestMapping("/test/login5.do")	
//	String login5(Model model, HttpServletRequest request,  HttpServletResponse response	) throws Exception{
//		System.out.println(model);
//		model.addAttribute("menu", "jajang");
//		System.out.println(model);
//		return "menupan";
//	}
//	
//	@RequestMapping("/test/login55.do")	
//	ModelAndView login55( HttpServletRequest request,  HttpServletResponse response	) throws Exception{
//		ModelAndView mav=new ModelAndView();
//		mav.addObject("menu", "jjamPPong");
//		mav.setViewName("menupan");
//		return mav;
//	}

}
