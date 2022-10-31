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
    public Set<Course> coursesEnrolled ;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AppUser)) return false;

        AppUser appUser = (AppUser) o;

        if (!userId.equals(appUser.userId)) return false;
        if (organisation != null ? !organisation.equals(appUser.organisation) : appUser.organisation != null)
            return false;
        if (firstName != null ? !firstName.equals(appUser.firstName) : appUser.firstName != null) return false;
        if (lastName != null ? !lastName.equals(appUser.lastName) : appUser.lastName != null) return false;
        if (role != appUser.role) return false;
        if (address != null ? !address.equals(appUser.address) : appUser.address != null) return false;
        if (userName != null ? !userName.equals(appUser.userName) : appUser.userName != null) return false;
        if (passWord != null ? !passWord.equals(appUser.passWord) : appUser.passWord != null) return false;
        if (assessment != null ? !assessment.equals(appUser.assessment) : appUser.assessment != null) return false;
        return coursesEnrolled != null ? coursesEnrolled.equals(appUser.coursesEnrolled) : appUser.coursesEnrolled == null;
    }

    @Override
    public int hashCode() {
        int result = userId.hashCode();
        result = 31 * result + (organisation != null ? organisation.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (passWord != null ? passWord.hashCode() : 0);
        result = 31 * result + (assessment != null ? assessment.hashCode() : 0);
        result = 31 * result + (coursesEnrolled != null ? coursesEnrolled.hashCode() : 0);
        return result;
    }
}
