package com.kev.CreateExam.src.model;

import java.io.Serializable;
import java.util.TimeZone;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kevin
 */
@Entity
@Table
public class City implements Serializable {


    @Id
    @Column
    public String name;

    @Column
    public TimeZone timeZone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
