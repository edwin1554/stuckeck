package cn.edu.zjiet.stucheck;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.zjiet.stucheck.mapper.UserMapper;
import cn.edu.zjiet.stucheck.pojo.Student;

@Controller
public class FreemarkerController {

    @Resource
    private UserMapper userMapper;
    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }

    @RequestMapping("/getRecord")
    public String getRecord(@RequestParam(name = "userName", required = true) String userName,
        Model model) throws Exception{
        Student student=userMapper.findByNo(userName);
        //response.sendRedirect("http://47.98.109.11/images/2/"+userName+".jpg");
        model.addAttribute("student",student);
        model.addAttribute("userName",userName);
        return "info";
    }
}