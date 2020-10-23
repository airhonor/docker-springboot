package com.honorzhang.docker.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.honorzhang.docker.springboot.mapper.PeopleMapper;
import com.honorzhang.docker.springboot.model.People;
import com.honorzhang.docker.springboot.service.PeopleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @program: webservice-example
 * @author: zgr
 * @create: 2020-09-16 15:54
 **/
@Service
@Slf4j
public class PeopleServiceImpl extends ServiceImpl<PeopleMapper, People> implements PeopleService {

}
