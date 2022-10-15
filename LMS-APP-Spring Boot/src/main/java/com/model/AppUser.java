package com.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String firstName;
    private String lastName;
    private Role role;
    private String address;
    private String userName;
    private String passWord;
    @ManyToMany
    @JoinTable(
            name = "course_Enrolled",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "courseId")
    )
    public Set<Course> coursesEnrolled=new HashSet<>(15);



}
