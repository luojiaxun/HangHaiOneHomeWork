package cn.crud.biz.impl;

import cn.crud.biz.UserInfoBiz;
import cn.crud.dao.UserInfoRepository;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 用户业务实现类
 */
@Service
public class UserInfoBizImpl implements UserInfoBiz {
    @Autowired
    private UserInfoRepository dao;
    //查询所有用户
    @Override
    public List<UserInfo> findAll() {
        return dao.findAll();
    }

    //添加用户
    @Override
    public String insert(UserInfo userInfo) {
        dao.save(userInfo);
        return "OK";
    }

    //修改用户
    @Override
    public String update(UserInfo userInfo) {
        dao.save(userInfo);
        return "OK";
    }

    //删除用户
    @Override
    public String delete(Integer id) {
        dao.deleteById(id);
        return "OK";
    }
}
