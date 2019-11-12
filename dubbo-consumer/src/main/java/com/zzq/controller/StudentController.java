package com.zzq.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zzq.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Reference
    private StudentService studentService;

    @RequestMapping("/getStudents")
    @ResponseBody
    public Object getStudents(String uid){
        return this.studentService.getStudents(uid);
    }

}
