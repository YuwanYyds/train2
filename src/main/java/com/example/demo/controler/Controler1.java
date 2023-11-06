package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Service1;
import com.example.demo.vo.User;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@RestController
@RequestMapping("user")
public class Controler1 {
	@Autowired
	private Service1 bl1;
   // public Controler1(Service1 bl1){
	//    this.bl1 = bl1;
	//}
@RequestMapping("select")
public List<User> bl2() {
	return bl1.stcsb();
}
}
