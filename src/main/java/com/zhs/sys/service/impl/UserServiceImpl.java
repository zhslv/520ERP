package com.zhs.sys.service.impl;

import com.zhs.sys.domain.User;
import com.zhs.sys.mapper.UserMapper;
import com.zhs.sys.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZHS
 * @since 2020-03-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
