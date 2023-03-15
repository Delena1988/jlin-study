package cn.joinhealth.springbootsqlite.service;

import cn.joinhealth.springbootsqlite.model.User;

/**
 * @author linjian
 * @date 14:39
 */
public interface UserService {
    /**
     * 根据id查用户
     *
     * @param id 用户id
     * @return
     */
    User getById(Integer id);

    /**
     * 查询用户
     *
     * @param user
     * @return
     */
    User selectUser(User user);
}
