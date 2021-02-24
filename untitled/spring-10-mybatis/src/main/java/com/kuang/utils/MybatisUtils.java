package com.kuang.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MybatisUtils {
    private static String CONFIG_FILE_LOCATION = "mybatis-config.xml";
    //当前线程里面存放session
    private static final ThreadLocal<SqlSession> threadLocal
            = new ThreadLocal<SqlSession>();
    private  static Reader reader = null;
    private  static SqlSessionFactoryBuilder builder=null;
    private  static SqlSessionFactory factory=null;

    //不允许对该类进行new操作
    private MybatisUtils(){}
    static{
        try {
            //1.加载配置文件
            reader=Resources.getResourceAsReader(CONFIG_FILE_LOCATION);
            //2.得到工厂的创建对象
            builder=new SqlSessionFactoryBuilder();
            //3.得到工厂对象
            factory=builder.build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取session
    public static SqlSession getSession(){
        SqlSession session=threadLocal.get();
        if(session==null){
            SqlSessionFactory factory=getFactory();
            session=factory.openSession();
            threadLocal.set(session);
        }
        return session;
    }
    //关闭session
    public static void closeSession(){
        SqlSession session=threadLocal.get();
        if(session!=null){
            session.close();
        }
        threadLocal.set(null);
    }
    //获得工厂对象
    public static SqlSessionFactory getFactory() {
        if(factory==null){
            factory=builder.build(reader);
        }
        return factory;
    }
}