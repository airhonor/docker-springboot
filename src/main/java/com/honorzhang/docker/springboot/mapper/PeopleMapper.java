package com.honorzhang.docker.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.honorzhang.docker.springboot.model.People;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: webservice-example
 * @author: zgr
 * @create: 2020-09-16 12:36
 **/
@Mapper
public interface PeopleMapper extends BaseMapper<People> {
}
