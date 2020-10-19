package cn.edu.zjiet.stucheck.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.edu.zjiet.stucheck.pojo.Student;

@Mapper
public interface UserMapper {
    Student findByNo(@Param("num") String num);
}