package com.cjk.controller;

import com.alibaba.fastjson.JSON;
import com.cjk.domain.TestVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {


	@GetMapping("/index")
	@ResponseBody
	public String index() {
		return JSON.toJSONString(new TestVO("chk", "male"));
	}


}
