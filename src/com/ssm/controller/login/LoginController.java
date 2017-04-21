package com.ssm.controller.login;


import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ssm.po.Navquery;
import com.ssm.po.user.T_UserCustom;
import com.ssm.service.IIndexService;
import com.ssm.service.login.ILoginService;


@Controller
public class LoginController{
	
	private Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private ILoginService iLoginService;
	
	@Autowired
	private IIndexService iIndexService;
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req) throws Exception{
		ModelAndView mv = new ModelAndView();
		//List<Navquery> navquery = iIndexService.findGrandnavByUserid(1);
		
		mv.setViewName("login");
		return mv;
	}
	/*@RequestMapping(value="/index")
	public ModelAndView index(UserCustom userCustom) throws Exception{
		ModelAndView mv = new ModelAndView();
			
		int count = iLoginService.findUserByUsernameandPassword(userCustom);
		if (count > 0){
			mv.addObject("userCustom",userCustom);	
			mv.setViewName("index");
		}else{
			mv.addObject("msg", "密码或者用户不存在！");
			mv.setViewName("login");
		}
		
		return mv;
	}
	*/
	@RequestMapping(value="/index")
	public ModelAndView index(T_UserCustom userCustom, HttpSession session) throws Exception{
		ModelAndView mv = new ModelAndView();
		int count = iLoginService.findUserCountByUsernameandPassword(userCustom);
		T_UserCustom userResult = iLoginService.findUserIDByUsernameandPassword(userCustom);
		
		if (count > 0){
			List<Navquery> listnavquery = iIndexService.findGrandnavByUserid(userResult.getF_user_id());
			mv.addObject("navquery",listnavquery);
			mv.addObject("userCustom",userCustom);	
			mv.setViewName("index");
		}else{
			mv.addObject("msg", "密码或者用户不存在！");
			mv.setViewName("login");
		}
		
		return mv;
	}
	
	@RequestMapping(value = "toindex", method = RequestMethod.POST)
    public void ajax(PrintWriter printWriter,T_UserCustom userCustom, HttpSession session) throws Exception {
		
        System.out.println(userCustom);
        JSONObject node = new JSONObject(); 
        session.setAttribute("UserCustom", userCustom);
        
        int count = iLoginService.findUserCountByUsernameandPassword(userCustom);
        node.put("count", count);
        String jsonString = JSON.toJSONString(node);
        
        printWriter.write(jsonString);
        printWriter.flush();
        printWriter.close();
      
        /*
        listFollowUpInfoCount = followUpInfoCountService.listFollowUpInfoCount(pd);	
		JSONArray jsonArr = JSONArray.fromObject(listFollowUpInfoCount);
		String jsonstr = jsonArr.toString();
		System.out.println(jsonArr);
		
		PrintWriter out = null;
		response.setContentType("application/json");
		
		out = response.getWriter();
		System.out.println(jsonstr);
		out.write(jsonstr);
        */
        
    }
	
	
	
	/*@RequestMapping(value = "/user/index", method = RequestMethod.POST)
	//根据用户名userName和密码password查看是否是非法用户，此处代码略。。。。
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(非法用户){
　　　　		out.print("<script language=\"javascript\">alert('登录失败！');window.location.href='/你的工程名/login'</script>");
　　　　		return "/login";
		}
		return "/user/index";　
	}*/
}
