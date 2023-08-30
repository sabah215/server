package io.getarrays.server.model;

import io.getarrays.server.enumeration.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    @Column (unique = true)
    @NotEmpty(message = "IP Address cannot be empty or null")
    private String ipAddress;
    @Column (name = "name")
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;
}
