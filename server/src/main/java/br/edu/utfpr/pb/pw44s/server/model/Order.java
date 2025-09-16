package br.edu.utfpr.pb.pw44s.server.model;

import br.edu.utfpr.pb.pw44s.server.dto.AddressDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_order")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private java.time.LocalDateTime dateTime;
    private Long userId;
    private String status;
    private Long address;

}
