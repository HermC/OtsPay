package edu.nju.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hermit on 2017/3/13.
 */
public class SecurityProvider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();

        System.out.println("start security verification provider");

        System.in.read(); // 按任意键退出
    }

}
