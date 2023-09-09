package com.example.prjcrud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.prjcrud.domain.Student;
import com.example.prjcrud.service.StudentService;
import com.example.prjcrud.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService {

    @Override
    public boolean addStudent(Student student) {
        return this.save(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        return this.getById(id);
    }

    @Override
    public boolean updateStudent(Student student) {
        return this.updateById(student);
    }

    @Override
    public boolean deleteStudent(Integer id) {
        return this.removeById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return this.list();
    }
}




