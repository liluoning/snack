package com.snack.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.snack.service.userService;

@Controller
@RequestMapping("/user")


public class UseFavController {

	@Autowired
	private userService userService;
	
	@RequestMapping("/favoriteAdd")
	public String addFavorite(Integer sId,HttpServletRequest request) {
		System.out.println("小吃的ID:"+sId);
		Integer uId = (Integer) request.getSession().getAttribute("frontuserId");
		System.out.println("当前登录的ID:"+uId);
		
		if(userService.selectFavorite(sId)==null) {
			userService.addFavorite(uId, sId);
		}
		else {
			System.out.println("商品已存在，不能重复添加");
		}
		
		return "redirect:/shop/proDatail?sId="+sId;
	}
}
