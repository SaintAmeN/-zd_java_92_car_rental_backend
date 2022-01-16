package com.sda.j92.carrentalbackend.model.dto;

import com.sda.j92.carrentalbackend.model.ApplicationUserRole;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationUserDto {
    private Long id;
    private String username;
    private boolean admin;
}
