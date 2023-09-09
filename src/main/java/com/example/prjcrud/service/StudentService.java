package com.example.prjcrud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.prjcrud.domain.Student;

import java.util.List;

public interface StudentService extends IService<Student> {

    // 添加学生信息
    boolean addStudent(Student student);

    // 根据ID获取学生信息
    Student getStudentById(Integer id);

    // 更新学生信息
    boolean updateStudent(Student student);

    // 删除学生信息
    boolean deleteStudent(Integer id);

    // 获取所有学生信息
    List<Student> getAllStudents();
}
