package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    //필드
	private static final long serialVersionUID = 1L;

	//생성자
    /*public HelloServlet() {
    } 기본생성자 사용 - 생략가능*/ 

    //메소드 g/s
    
    //메소드 일반 doget,dopost메소드 두개 전에 get/post방식 두가지있다고했던거
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//response.getWriter().append("Served at: ").append(request.getContextPath());
    	//코드작성
    	response.setContentType("text/html;charset=utf-8");
    	
    	PrintWriter out  = response.getWriter();
    	out.println("<!DOCTYPE html>");
    	out.println("<head>");

        out.println("<head>");
    
    }
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
