package com.imax.controller;

import com.imax.pojo.StudentInfoTable;
import com.imax.service.StudentInfoService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private StudentInfoService studentInfoService;

    @RequestMapping(value = "/employee/page/{pageNum}", method = RequestMethod.GET)
    public PageInfo<StudentInfoTable> getEmployeePage(@PathVariable("pageNum") Integer pageNum, Model model){
        //获取员工的分页信息
//        PageInfo<StudentInfoTable> page = studentInfoService.getEmployeePage(pageNum);
        return null;
    }

    @RequestMapping(value = "/getAllEmployee", method = RequestMethod.GET)
    @ResponseBody
    public List<StudentInfoTable> getAllEmployee(){
        //查询所有的员工信息
//        List<StudentInfoTable> list = studentInfoService.getAllEmployee();
        return null;
    }
    @Controller
    public class ExampleController {

        @RequestMapping("/index")
        public String example(Model model) {
            // 在Controller中设置数据
            String message = "Hello from Controller";
            model.addAttribute("message", message);

            // 返回JSP页面的逻辑视图名称
            return "index";
        }
    }


}

