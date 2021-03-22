package co.com.jsierra.postgresqlr2dbc.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table("users_table")
public class UserModels {
    @Id
    private Long id;
    private String username;
    private String password;
    private boolean active;
}
