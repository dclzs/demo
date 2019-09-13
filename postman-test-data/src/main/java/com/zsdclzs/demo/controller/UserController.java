package com.zsdclzs.demo.controller;

import com.zsdclzs.demo.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "白龙马"));
        users.add(new User(2, "唐僧"));
        users.add(new User(3, "孙悟空"));
        users.add(new User(4, "沙僧"));
        users.add(new User(5, "猪八戒"));
    }

    private static User find(Integer id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }

        return null;
    }

    @GetMapping("users")
    public List<User> users() {
        return users;
    }

    @GetMapping("user/{id}")
    public User user(@PathVariable("id") Integer id) {
        return find(id);
    }

    @PostMapping("user")
    public String saveUser(@RequestBody User user) {
        return users.add(user)
                ? "添加成功！"
                : "添加失败！";
    }

    @PatchMapping("user/{id}")
    public String updateName(@PathVariable("id") Integer id, @RequestBody User user) {
        User u = find(id);
        if (u == null) {
            return "更新失败！";
        }

        u.setName(user.getName());
        return "更新成功!";
    }

    @DeleteMapping("user/{id}")
    public User deleteUser(@PathVariable("id") Integer id) {
        User user = find(id);
        if (user != null) {
            users.remove(user);
        }

        return user;
    }


}
