package com.cyqqq.platform.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Description
 *
 * @Author : huangjinxing
 * @Email : hmm7023@gmail.com
 * @Date : 2018/9/30 11:33
 * @Version :
 */
@Mapper
public interface UserMapper {


    /**
     * 根据用户名获取权限
     * @param username
     * @return
     */
    @Select("select role from t_user where username = #{username}")
    @Results({@Result(property = "role", column = "role")
    })
    String getRole(String username);

    /**
     * 根据用户名获取密码
     * @param username
     * @return
     */
    @Select("select password from t_user where username = #{username}")
    @Results({@Result(property = "password", column = "password")
    })
    String getPassword(String username);

}
