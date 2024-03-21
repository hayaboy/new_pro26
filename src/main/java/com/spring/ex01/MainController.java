package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


//주석이 달린 클래스가 "컨트롤러"(예: 웹 컨트롤러)임을 나타냅니다.
//이 주석은 @Component의 특수화 역할을 하여 클래스 경로 검색을 통해 구현 클래스가 자동 감지되도록 합니다. 
//일반적으로 RequestMapping 주석을 기반으로 주석 처리기 메서드와 함께 사용됩니다.

//@Controller(value = "mainController")  // id는 mainController
//@RequestMapping(value = "/test/*")
public class MainController {
	


//	// 요청 처리 클래스의 메소드에 웹 요청을 매핑하기 위한 주석입니다.	
////	@RequestMapping(value = "/hi.do", method = RequestMethod.GET)  //기본이 GET이므로 생략 가능
//	public ModelAndView main1(HttpServletRequest request,  HttpServletResponse response ) throws Exception{
//		ModelAndView mav=new ModelAndView();
//		
//		mav.addObject("age", 33);
//		mav.addObject("color", "파란색");
//		mav.setViewName("main");
//		
//		Student stu1=new Student();
//		stu1.setBan(1);
//		stu1.setName("홍길동");
//		
//		
//		
//		mav.addObject("student", stu1);
//		
////		Student stu2=new Student(7, "홍이동");
////		
////		mav.addObject("student2", stu2);
//		
//		return mav;
//	}
//	
////	@RequestMapping(value = "/hi2.do")
//	public ModelAndView main2(HttpServletRequest request,  HttpServletResponse response ) throws Exception{
//		ModelAndView mav=new ModelAndView();
//		mav.setViewName("main2");
//		return mav;
//	}
//	
////	@RequestMapping(value = "/hi3.do")
//	public ModelAndView main3(HttpServletRequest request,  HttpServletResponse response ) throws Exception{
//		ModelAndView mav=new ModelAndView();
//		mav.setViewName("hi3");
//		return mav;
//	}
//	
//	
////	@RequestMapping(value = "/hi4.do")
//	public ModelAndView main4(HttpServletRequest request,  HttpServletResponse response ) throws Exception{
//		ModelAndView mav=new ModelAndView();
//		mav.setViewName("hi4");
//		return mav;
//	}
//	
//	
//	@RequestMapping(value = "/loginForm.do")
//	public ModelAndView loginForm(HttpServletRequest request,  HttpServletResponse response ) throws Exception{
//		ModelAndView mav=new ModelAndView();
//		mav.setViewName("loginForm");
//		return mav;
//	}
//	
//	@RequestMapping(value = "/login.do", method = RequestMethod.POST )
//	public ModelAndView login(@RequestParam(value = "id2") String id ,HttpServletRequest request,  HttpServletResponse response ) throws Exception{
//		ModelAndView mav=new ModelAndView();
//		
//		System.out.println("#"+id + "#");
////		String id=request.getParameter("id");
//
////		mav.addObject("id", null);
////		
////		mav.setViewName("loginResult");
//		return mav;
//	}

}
