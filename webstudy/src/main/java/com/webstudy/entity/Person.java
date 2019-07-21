package com.webstudy.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @ConfigurationProperties 告诉spring boot 将本类的所有属性与配置文件中相关的配置进行绑定,默认从全局配置文件中回去值
 * prefix = "person"，指定配置文件中 哪一部分的配置进行绑定
 *
 * 要使用上面注解必须先将对象加入到spring 容器中
 */
@Component
@ConfigurationProperties(prefix = "person")
@PropertySource(value = {"classpath:person.properties"}) //@PropertySource 可以指定其他属性文件来进行配置
public class Person {

    private String name;
    private int age;

    private Dog dog;

    private List<String> color;

    private Map<String,Object> love;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public Map<String, Object> getLove() {
        return love;
    }

    public void setLove(Map<String, Object> love) {
        this.love = love;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                ", color=" + color +
                ", love=" + love +
                '}';
    }
}
