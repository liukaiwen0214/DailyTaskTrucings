package com.imax.service.impl;

import com.imax.mapper.StudentInfoMapper;
import com.imax.pojo.StudentInfoTable;
import com.imax.service.StudentInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.imax.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class StudentInfoServiceImpl implements StudentInfoService {

    @Override
    public List<StudentInfoTable> getAllStudent() throws IOException {
        ArrayList<StudentInfoTable> studentInfoTableArrayList = new ArrayList<>();
        StudentInfoMapper mapper = new SqlSessionUtil().SqlSessionUtil().getMapper(StudentInfoMapper.class);
        List<StudentInfoTable> allStudent = mapper.getAllStudent();
        return allStudent;
    }

    @Override
    public List<StudentInfoTable> selectStudent(String id) throws IOException {
        ArrayList<StudentInfoTable> studentInfoTableArrayList = new ArrayList<>();
        StudentInfoMapper mapper = new SqlSessionUtil().SqlSessionUtil().getMapper(StudentInfoMapper.class);
        StudentInfoTable studentInfoTable = mapper.selectStudent(id);
        studentInfoTableArrayList.add(studentInfoTable);
        return studentInfoTableArrayList;
    }

    @Override
    public List<StudentInfoTable> likeSelect(String uid, String name) throws IOException {
        List<StudentInfoTable> studentInfoTables = new SqlSessionUtil().SqlSessionUtil().getMapper(StudentInfoMapper.class).likeSelect(uid, name);
        return studentInfoTables;
    }

    @Override
    public List<StudentInfoTable> selectSinge(StudentInfoTable studentInfoTable) throws IOException {
        List<StudentInfoTable> studentInfoTables = new SqlSessionUtil().SqlSessionUtil().getMapper(StudentInfoMapper.class).selectSinge(studentInfoTable);
        return studentInfoTables;
    }

    @Override
    public int insertStudent(StudentInfoTable studentInfoTable) throws IOException {
        SqlSession sqlSession = new SqlSessionUtil().SqlSessionUtil();
        int i1 = sqlSession.getMapper(StudentInfoMapper.class).insertStudent(studentInfoTable);
        sqlSession.commit();
        return i1;
    }

    @Override
    public int updateStudent(StudentInfoTable studentInfoTable) throws IOException {
        SqlSession sqlSession = new SqlSessionUtil().SqlSessionUtil();
        int i = sqlSession.getMapper(StudentInfoMapper.class).updateStudent(studentInfoTable);
        sqlSession.commit();
        return i;
    }

    @Override
    public int delStudent(String[] strings) throws IOException {
        SqlSession sqlSession = new SqlSessionUtil().SqlSessionUtil();
        int i = sqlSession.getMapper(StudentInfoMapper.class).delStudent(strings);
        sqlSession.commit();
        return i;
    }

}

