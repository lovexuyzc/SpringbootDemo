package com.boot.springbootdemo.Entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name="student")
@Entity
@Data
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Entitys implements Serializable {

    @Id
    @Column(name="ID")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="EMAIL")
    private String email;
    @Column(name="AGE")
    private Integer age;


}
