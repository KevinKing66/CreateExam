package com.kev.CreateExam.src.model;

import com.kev.CreateExam.src.enums.AnswerEnum;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author kevin
 */
@Entity
@Table
public class Exam implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @JoinColumn(name = "id")
    //@OneToMany(cascade = CascadeType.ALL)
    String correctAnswerList;

    public Exam() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCorrectAnswerList() {
        return correctAnswerList;
    }

    public void setCorrectAnswerList(String correctAnswerList) {
        this.correctAnswerList = correctAnswerList;
    }

}
