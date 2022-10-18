package com.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@ToString
@EqualsAndHashCode
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    @ManyToOne
    @JoinColumn(name = "organisation_id")
    private Organisation organisation;
    private String firstName;
    private String lastName;
    private Role role;
    private String address;
    private String userName;
    private String passWord;

    @ManyToMany
    @JoinTable(
            name = "user_Assessment",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "assessment_Id")
    )
    private Set<Assessment> assessment;

    @ManyToMany
    @JoinTable(
            name = "course_Enrolled",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "courseId")
    )
    public Set<Course> coursesEnrolled = new HashSet<>(15);



}
