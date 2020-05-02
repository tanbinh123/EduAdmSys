package com.qifangli.edumanage.service.impl;

import com.qifangli.edumanage.dao.entity.Student;
import com.qifangli.edumanage.dao.mapper.StudentMapper;
import com.qifangli.edumanage.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
//    @Autowired
    @Resource
    private StudentMapper studentMapper;


    @Override
    public Student findStudentByIdAndPwd(String id, String pass) {
        return studentMapper.findStudentByIdAndPwd(id,pass);
    }
}
