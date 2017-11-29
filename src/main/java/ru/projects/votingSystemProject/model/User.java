package ru.projects.votingSystemProject.model;

import java.util.Date;
import java.util.Set;

public class User
{
    private int id;
    private String name;
    private String email;
    private String password;
    private Date votingDateTime = new Date();
    private Set<Role> roles;
    public static final int VOTES_PER_DAY = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getVotingDateTime() {
        return votingDateTime;
    }

    public void setVotingDateTime(Date votingDateTime) {
        this.votingDateTime = votingDateTime;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public int getVotesPerDay() {
        return VOTES_PER_DAY;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", votingDateTime=" + votingDateTime +
                ", roles=" + roles +
                ", votesPerDay=" + VOTES_PER_DAY +
                '}';
    }
}
