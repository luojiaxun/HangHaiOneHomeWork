package cn.crud.web.controller;

import cn.crud.pojo.ResponseObject;
import cn.crud.pojo.UserInfo;
import cn.crud.service.impl.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userinfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    //删除用户
    @DeleteMapping("/{id}")
    public ResponseObject delete(@PathVariable Integer id){
        userInfoService.deleteById(id);
        return new ResponseObject("删除成功","200",null);
    }

    //修改用户
    @PutMapping
    public ResponseObject update(@RequestBody UserInfo userInfo){
        userInfoService.update(userInfo);
        return new ResponseObject("修改成功","200",null);
    }

    //查询所有用户信息
    @GetMapping
    public ResponseObject query(){
        List<UserInfo> list = userInfoService.findAll();
        return new ResponseObject("查询成功","200",list);
    }

    //新增用户信息
    @PostMapping
    public ResponseObject create(@RequestBody UserInfo userInfo){
        userInfoService.save(userInfo);
        return new ResponseObject("新增成功","200",null);
    }
}
