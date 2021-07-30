package com.example.app.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Customer")
@Getter @Setter @NoArgsConstructor
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int CustomerID;
    public String CustomerName;
    public String Address;
    public String Login;
    public String Password;
    public String Gender;
    public String Email;
    public String Nationality;
    public Boolean IsSuperuser;
    public Boolean IsAdmin;

 
//
//    public Customer() {
//        
//    }
//    

    public Customer(int CustomerID, String CustomerName, String Address, String Login, String Password, String Gender, String Email, String Nationality, Boolean IsSuperuser, Boolean IsAdmin) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.Address = Address;
        this.Login = Login;
        this.Password = Password;
        this.Gender = Gender;
        this.Email = Email;
        this.Nationality = Nationality;
        this.IsSuperuser = IsSuperuser;
        this.IsAdmin = IsAdmin;
    }
}
