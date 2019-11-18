package com.zzq.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zzq.service.StudentService;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

@Service(validation = "true")
@org.springframework.stereotype.Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<String> getStudents(String uid) {
        System.out.println("==============================>被执行==>" + uid );
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangzq");
        list.add("licm");
        list.add(uid);

        try {
            InetAddress address = InetAddress.getLocalHost();
            list.add(address.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return list;
    }
}
