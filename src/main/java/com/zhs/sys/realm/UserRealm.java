package com.zhs.sys.realm;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhs.sys.common.ActiverUser;
import com.zhs.sys.domain.User;
import com.zhs.sys.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class UserRealm extends AuthorizingRealm {
    @Autowired
    @Lazy  //只有使用的时候才加载
    private UserService userService;

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        QueryWrapper<User> queryWrapper= new QueryWrapper<>();
        queryWrapper.eq("loginname", authenticationToken.getPrincipal().toString());
        User user = userService.getOne(queryWrapper);
        if(user!=null){
            ActiverUser activerUser = new ActiverUser();
            activerUser.setUser(user);
            ByteSource byteSource = ByteSource.Util.bytes(user.getSalt());
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(activerUser,user.getPwd(),byteSource,this.getName());
            return info;
        }
        return null;
    }
}
