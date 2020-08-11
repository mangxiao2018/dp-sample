package com.mangxiao.dp.sample.builder;

public class TestBuilder {

    public static void main(String[] String){
        Programmer p = new Programmer.ProgrammerBuilder()
                .setFirstName("mangxiao")
                .setLastName("zhang")
                .setAddress("chaoyang of beijing")
                .setZipCode("100089")
                .setCity("beijing")
                .setLanguages(new String[]{"chinese","english"})
                .setProjects(new String[]{"Mis","Pis"})
                .build();
        System.out.println(p.toString());
    }

}
