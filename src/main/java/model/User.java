package model;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.TABLE)
    private Long id;

    private String firstName;

    private String lastName;

    @Column(name = "email" , unique = true)
    private String email;

    private String password;

    private String image;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
