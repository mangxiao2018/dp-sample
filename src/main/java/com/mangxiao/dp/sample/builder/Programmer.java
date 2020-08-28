package com.mangxiao.dp.sample.builder;

/**
 * @description:建设者模式,也叫创建者模式，又叫建造者模式
 * @author:mangxiao
 * @date:2020-8-11
 * 在创建建设者模式时，注意以下几个关键点(特点)：
 * 1.XXX中的XXXBuilder是个内部静态类
 * 2.XXX需要构建private的构造方法
 * 3.在XXXBuilder中setYY(String yy)时，既需要做set操作又需要返回的是代表XXXBuilder的this
 * 4.在XXXBuilder的最后有build(),返回的是 new XXX() 前面提到的私有构造方法
 *
 * 优点：
 * 1.通过建设者模型创建的对象，一旦创建后不允许再通过set修改对象里面的属性值了
 * 2.因为构造方法已设置成private，所以不允许通过构造方法为对象里的属性赋值
 * 3.当属性很多时，如果不用建设者模型，而是通过构造方式来做的话，会导致构造方式的参数很多，很长
 * 4.通过建设者模式，可以在build方法内，校验逻辑放到这里来做，包括必填项校验、依赖关系校验、约束条件校验等
 * 5.建设者模式的setXXX()方法内可以增加对单个属性变量的校验，如非空校验、如查是数值类型是否业务上允许为负数等等
 *
 * 缺点：
 * 1.属性值被定义了两次，如本例中在Programmer中定义了一次，在ProgrammerBuilder中又定义了一次，这里有代码冗余
 *
 * 对比：
 * 如果不用建设者模式，而使用普通的构造方法 + new 的方式，在对属性赋值时太凌乱，使用时会很长，必填项，选填项不好区分，属性间的依赖关系不好约束，代码没有章法
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

        /**
         * 单个属性校验
         * 可以增加对firstName这种单个属性变量的校验，如非空校验、如查是数值类型是否业务上允许为负数等等
         */
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

        /**
         * 各个属性变量的校验
         * 校验逻辑放到这里来做，包括必填项校验、依赖关系校验、约束条件校验等
         * @return
         */
        public Programmer build(){
            return new Programmer(firstName,lastName,address,zipCode,city,languages,projects);
        }
    }

}
