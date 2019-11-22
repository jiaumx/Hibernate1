package com.mqc.dao;

import com.mqc.po.Student;

import java.util.List;

/**
 * @author lenovo
 * @create 2019-11-11:00
 */
public interface StudentDao {
    List<Student> selectAll();
}
