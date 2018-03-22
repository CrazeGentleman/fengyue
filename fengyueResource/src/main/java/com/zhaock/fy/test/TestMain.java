package com.zhaock.fy.test;

import java.io.IOException;
import org.apache.ibatis.session.SqlSession;


import com.zhaock.fy.bean.UserBean;
import com.zhaock.fy.instance.DBComInstance;
import com.zhaock.fy.mapper.UserMapper;

public class TestMain {
	public static void main(String[] args) throws IOException {

		SqlSession sqlSession = DBComInstance.getSqlSession();
        try  
        {  
        	UserMapper  up = (UserMapper) sqlSession.getMapper(UserMapper.class);
        
            System.out.println(up.toString());  
        }  
        finally  
        {  
        	sqlSession.close();  
        }  
    }  

}
