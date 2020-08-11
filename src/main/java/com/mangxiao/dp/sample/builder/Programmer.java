package com.mangxiao.dp.sample.builder;

/**
 * @description:建设者模式
 * @author:mangxiao
 * @date:2020-8-11
 * 在创建建设者模式时，注意以下几个关键点：
 * 1.XXX中的XXXBuilder是个内部静态类
 * 2.XXX需要构建private的构造方法
 * 3.在XXXBuilder中setYY(String yy)时，既需要做set操作又需要返回的是代表XXXBuilder的this
 * 4.在XXXBuilder的最后有build(),返回的是 new XXX() 前面提到的私有构造方法
 */
public class Programmer {
    private String firstName;
    private String lastName;
    private String address;
    private String zipCode;
    private String city;
    private String[] languages;
    private String[] projects;

    private Programmer(String firstName,
                       String lastName,
                       String address,
                       String zipCode,
                       String city,
                       String[] languages,
                       String[] projects){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.languages = languages;
        this.projects = projects;
    }

    @Override
    public String toString() {
        return this.firstName + "," + this.lastName + "," + this.zipCode + "," + this.address + "," + this.city + "," + this.languages.toString() + "," + this.projects.toString();
    }


    public static class ProgrammerBuilder {
        private String firstName;
        private String lastName;
        private String address;
        private String zipCode;
        private String city;
        private String[] languages;
        private String[] projects;

        public ProgrammerBuilder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public ProgrammerBuilder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public ProgrammerBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        public ProgrammerBuilder setZipCode(String zipCode){
            this.zipCode = zipCode;
            return this;
        }

        public ProgrammerBuilder setCity(String city){
            this.city = city;
            return this;
        }

        public ProgrammerBuilder setLanguages(String[] languages){
            this.languages = languages;
            return this;
        }

        public ProgrammerBuilder setProjects(String[] projects){
            this.projects = projects;
            return this;
        }

        public Programmer build(){
            return new Programmer(firstName,lastName,address,zipCode,city,languages,projects);
        }
    }

}
