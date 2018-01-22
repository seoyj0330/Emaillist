package com.javaex.dao;

import java.util.List;

import com.javaex.vo.EmaillistVo;

public class DaoTest {

	public static void main(String[] args) {
		
		EmaillistVo vo = new EmaillistVo(1,"유","재석","you1111@asdf.com");
		
		EmaillistDao dao = new EmaillistDao();
		
		
		//dao.insert(vo);
		List<EmaillistVo> emaillist = dao.getList();
		for(EmaillistVo evo : emaillist) {
			System.out.println(evo);
		}
		
	}


}
