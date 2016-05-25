import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FbqListImpl;
import services.IFbqList;
import type.Fbq;

import java.util.List;

/**
 * Created by Eric on 25/05/2016.
 */
public class Principale {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        // set spring context for application.
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-config.xml"});

        // call my service
        IFbqList tempList = (FbqListImpl) context.getBean("fbqListImpl");

        // We calculte and print numbers from 1 to 100
        List<Fbq> results = tempList.calculateALL(100);
        for (Fbq fbq : results) {
            System.out.println(fbq.toString());
        }
    }
}
