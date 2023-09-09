package com.example.prjcrud.controller;

import com.example.prjcrud.domain.Student;
import com.example.prjcrud.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/stud  ents")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // 显示所有学生信息列表
    @GetMapping("/list")
    public String listStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "student/list";
    }

    // 显示添加学生信息的表单
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "student/add";
    }

    // 处理添加学生信息的表单提交
    @PostMapping("/add")
    public String addStudent(@ModelAttribute("student") Student student) {
        studentService.addStudent(student);
        return "redirect:/students/list";
    }

    // 显示更新学生信息的表单
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "student/edit";
    }

    // 处理更新学生信息的表单提交
    @PostMapping("/edit/{id}")
    public String updateStudent(@PathVariable("id") Integer id, @ModelAttribute("student") Student student) {
        studentService.updateStudent(student);
        return "redirect:/students/list";
    }

    // 删除学生信息
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") Integer id) {
        studentService.deleteStudent(id);
        return "redirect:/students/list";
    }
}

