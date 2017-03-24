package com.wut.testPrj;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wut.dao.InvAdvRptSitSub1DAO;
import com.wut.model.MastCarSeriesModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try{
	        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
	        InvAdvRptSitSub1DAO invAdvRptSitSub1Dao = (InvAdvRptSitSub1DAO)context.getBean("invAdvRptSitSub1Dao");
	        List<MastCarSeriesModel> results = invAdvRptSitSub1Dao.getData();
	        for(MastCarSeriesModel bean:results){
	        	System.out.println(bean.getSeriesEname());
	        }
	        ((ConfigurableApplicationContext)context).close();
	        
	        throw new Exception("Test");
        }catch(Exception e){
        	System.out.println(e.getMessage());
        	e.printStackTrace();
        }
    }
}
