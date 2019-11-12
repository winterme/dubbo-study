package com.zzq.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zzq.service.StudentService;

import java.util.ArrayList;
import java.util.List;

@Service
@org.springframework.stereotype.Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<String> getStudents(String uid) {
        System.out.println("==============================>被执行==>" + uid );
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangzq");
        list.add("licm");
        list.add(uid);

        return list;
    }
}
