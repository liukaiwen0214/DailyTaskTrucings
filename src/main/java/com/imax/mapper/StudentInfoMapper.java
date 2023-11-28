package com.imax.mapper;
import com.imax.pojo.StudentInfoTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface StudentInfoMapper {

    /**
     * 查询所有的员工信息
     * @return
     */
    List<StudentInfoTable> getAllStudent();

    /**
     * @param id
     * @return {@link StudentInfoTable}
     */
    StudentInfoTable selectStudent(String id);

    List<StudentInfoTable> likeSelect(@Param("uid") String uid, @Param("name") String name);


    List<StudentInfoTable> selectSinge(StudentInfoTable studentInfoTable);


    int insertStudent(StudentInfoTable studentInfoTable);

    int updateStudent(StudentInfoTable studentInfoTable);


    int delStudent(@Param("id") String[] id);

}

