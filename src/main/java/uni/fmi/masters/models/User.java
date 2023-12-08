package uni.fmi.masters.models;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class User extends BaseModel{
    @Column(nullable = false, length = 1)
    private int roleId; //1 for customer, 2 for shop owner, 3 for admin
    @Column(nullable = false, length = 256)
    private String firstName;
    @Column(nullable = false, length = 256)
    private String lastName;
    @Column(nullable = false, length = 56)
    private String password;
    @Column(nullable = false, length = 256, unique=true)
    private String email;
    @Column(nullable = false, length = 56)
    private String phone;
    @Column(nullable = false, length = 256)
    private String address;
}
