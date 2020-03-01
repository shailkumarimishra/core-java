package com.jdbc.dao;

import java.util.List;

import com.jdbc.entity.StudentEntity;

public interface StudentDAO {
public List<StudentEntity> findAll();
public StudentEntity findOneStudent();
public int updateStudent(int studentId);
public int deleteStudent(int studentId);
}
