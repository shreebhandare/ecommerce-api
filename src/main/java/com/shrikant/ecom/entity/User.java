package com.shrikant.ecom.entity;

import java.util.Date;
import org.springframework.stereotype.Component;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
// @Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String userId;
    String userName;
    String email;
    String password;
    String firstName;
    String lastName;
    String phone;
    Date createdAt;
    Date updatedAt;
    Boolean enabled;

    @OneToOne
    String role_id;

}
