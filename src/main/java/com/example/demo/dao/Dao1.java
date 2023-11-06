package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.vo.User;
@Component
public interface Dao1 {
	List<User> selectUsers();
}
