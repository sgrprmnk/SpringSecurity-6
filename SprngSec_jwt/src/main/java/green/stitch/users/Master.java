package green.stitch.users;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Master implements UserDetails {
    @Id
    @GeneratedValue
    private Integer id;
   // @Pattern(regexp="^[A-Z][a-z][0-9]*]",message = "{name.invalid}")
    private String firstName;
    // @Pattern(regexp="^[A-Z][a-z][0-9]*]",message = "{name.invalid}")
    private String lastName;
    private String email;
   // @Size(min=6, max=12)
  //  @Pattern(regexp="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$",message = "Password should be minimum of 6 and maximum of 12 length, One Alphabet, One UpperCase, One Special character, One digit from 0 to 9")
    private String password; //pass
@Enumerated(EnumType.STRING)
    private Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return password; //pass
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
