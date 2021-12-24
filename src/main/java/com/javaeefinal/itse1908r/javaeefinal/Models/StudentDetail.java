package com.javaeefinal.itse1908r.javaeefinal.Models;

import javax.persistence.*;

@Entity
@Table(name = "student_details", indexes = {
        @Index(name = "student_details_group_id_key", columnList = "group_id", unique = true)
})
public class StudentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private User student;

    @Column(name = "group_id")
    private Integer groupId;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}