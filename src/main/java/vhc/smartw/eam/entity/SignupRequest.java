package vhc.smartw.eam.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(	name = "SYS_USERS")
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String  username;

    @NotBlank
    @Size(min = 6, max = 40)
    @Column(name = "PASSWORD")
    private String password;
    @NotBlank
    @Size(max = 50)
    @Column(name = "EMAIL")
    private String email;


    private Set<String> role;
}
