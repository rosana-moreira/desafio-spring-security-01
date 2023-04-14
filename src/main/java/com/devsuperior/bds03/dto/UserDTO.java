package com.devsuperior.bds03.dto;

import com.devsuperior.bds03.entities.User;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    @Email(message = "Favor entrar um e-mail válido")
    private String email;
    private List<RoleDTO> roles = new ArrayList<>();

    public UserDTO() {
    }

    public UserDTO(Long id, String firstName, String lastName, String email, String password, List<RoleDTO> roles) {
        this.id = id;
        this.email = email;
    }

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.email = entity.getEmail();
        entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<RoleDTO> getRoles() {
        return roles;
    }
}
