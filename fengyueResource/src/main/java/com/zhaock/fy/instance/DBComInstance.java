package com.zhaock.fy.instance;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.istack.internal.logging.Logger;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class DBComInstance {
	static Logger logger = Logger.getLogger(DBComInstance.class);
	private static SqlSession sqlSession;
	
	 public synchronized static SqlSession getSqlSession(){
		String resource = "mybatis-config.xml";  
        InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);  
        sqlSession = sqlSessionFactory.openSession();
        logger.info("get SQL success");
		return sqlSession;
	}

	
}
