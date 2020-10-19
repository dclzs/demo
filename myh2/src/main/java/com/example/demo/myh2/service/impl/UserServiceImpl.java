package com.example.demo.myh2.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.myh2.entity.User;
import com.example.demo.myh2.mapper.UserMapper;
import com.example.demo.myh2.service.IUserService;
import org.springframework.stereotype.Service;


/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}