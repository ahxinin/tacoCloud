package com.ahxinin.tacocloud;

import com.ahxinin.tacocloud.domain.User;
import com.ahxinin.tacocloud.infrastructure.mapper.UserMapper;
import java.util.List;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : hexin
 * @description: mapper测试类
 * @date : 2022-02-02
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class MapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void select(){
        List<User> userList = userMapper.selectList(null);
        log.info(String.valueOf(userList));
    }
}
