package com.dao;

import com.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by wangyong on 16-10-20.
 */
@Mapper
@Repository
public interface UserMapper {

     User getUser(String userName);
}
