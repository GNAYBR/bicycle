package com.aowin.test;

import com.aowin.pojo.BicycleDeploy;
import com.aowin.util.TimeUtils;

public class Test {

    public void fun(){
//        ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");

//        bicycleDeployMapper = ap.getBean(BicycleDeployMapper.class);
        BicycleDeploy bicycleDeploy = new BicycleDeploy();

        bicycleDeploy.setBicycleId(1);
        bicycleDeploy.setToPileId(1);
        bicycleDeploy.setToReason("1");
        bicycleDeploy.setToTime(TimeUtils.getInstance().getNowTimeFormat());
        bicycleDeploy.setStatus("1");
        bicycleDeploy.setToCardId(123);
        bicycleDeploy.setDeployId(null);

        System.out.println(bicycleDeploy);
//        bicycleDeployMapper.insertBicycleDeploy(bicycleDeploy);
        System.out.println(bicycleDeploy.getDeployId());
    }
    public static void main(String[] args) {
         Test t = new Test();
         t.fun();
    }
}
