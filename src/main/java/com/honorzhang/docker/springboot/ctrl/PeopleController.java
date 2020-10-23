package com.honorzhang.docker.springboot.ctrl;

import com.honorzhang.docker.springboot.model.People;
import com.honorzhang.docker.springboot.service.PeopleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: docker-springboot
 * @author: zgr
 * @create: 2020-10-22 22:08
 **/
@RestController
@Slf4j
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    /**
     * 查找全部人员
     * @return 查找全部人员
     */
    @GetMapping("/all")
    public ResponseEntity<List<People>> findAll(){
        List<People> result = peopleService.list();
        if (result.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(result);
    }
}
