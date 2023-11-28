package com.imax.service;

import com.imax.pojo.StudentInfoTable;
import com.github.pagehelper.PageInfo;

import java.io.IOException;
import java.util.List;

/**
 * Service
 */
public interface StudentInfoService {

    /**
     * 查询所有的员工信息
     *
     * @return
     */
    List<StudentInfoTable> getAllStudent() throws IOException;

    /**
     * 获取员工的分页信息
     *
     * @param id
     * @return
     */
    List<StudentInfoTable> selectStudent(String id) throws IOException;

    List<StudentInfoTable> likeSelect(String uid,String name) throws IOException;

    List<StudentInfoTable> selectSinge(StudentInfoTable studentInfoTable) throws IOException;

    int insertStudent(StudentInfoTable studentInfoTable) throws IOException;

    int updateStudent(StudentInfoTable studentInfoTable)throws IOException;

    int delStudent(String[] strings)throws IOException;
}

