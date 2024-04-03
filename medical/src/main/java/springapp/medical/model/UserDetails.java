package springapp.medical.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;
    @Column(name="Name")
    private String Name;
    @Column(name="Gender")
    private String Gender;
    @Column(name="Email")
    private String Email;
    @Column(name="Phone Number")
    private long Phone_Number;
    @Column(name="Password")
    private String Password;
    public UserDetails(int id, String name, String gender, String email, long phone_Number, String password) {
        this.id = id;
        Name = name;
        Gender = gender;
        Email = email;
        Phone_Number = phone_Number;
        Password = password;
    }
    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public long getPhone_Number() {
        return Phone_Number;
    }
    public void setPhone_Number(int phone_Number) {
        Phone_Number = phone_Number;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
}