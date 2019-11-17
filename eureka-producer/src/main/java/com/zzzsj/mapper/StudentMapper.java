package com.zzzsj.mapper;


import com.zzzsj.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    /**
     * 查询学生
     * @return
     */
    List<Student> selectStudentList();

    /**
     * 添加学生
     * @param student
     */
    void insertStudent(Student student);

    /**
     * 根据id删除学生
     * @param
     * @return
     */
    int deleteStudentById(Integer id);

    /**
     * 根据id修改学生
     * @param student
     * @return
     */
    int updateStudentById(Student student);

    /**
     * 根据id查询学生
     * @param
     * @return
     */
    Student selectStudentById(Integer id);
}
