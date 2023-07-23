package org.example.JPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "USERTable")
public class UserDAO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "name")
    private String name;
    @Id
    @Column(name = "email")
    private String email;
    @Column(name = "age")
    private int age;

    public UserDAO(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}