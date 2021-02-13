package com.company.反射机制.反射Method.获取Method;

/**
 * @author ShiWei
 * @date 2021/2/7 - 20:42
 *
 * 用户业务类
 */
public class UserService {

    /**
     * 登录方法
     * @param name 用户名
     * @param password 密码
     * @return true表示登录成功, false表示登录失败
     */
    public boolean login(String name, String password) {
        if ("admin".equals(name) && "123".equals(password)) {
            return true;
        }
        return false;
    }
}
