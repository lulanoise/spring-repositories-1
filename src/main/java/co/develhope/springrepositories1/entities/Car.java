package co.develhope.springrepositories1.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Column(name = "modelName")
    private String modelName;

    @NotNull
    @Column(name = "serialNumber")
    private String serialNumber;

    @NotNull
    @Column(name = "currentPrice")
    private String currentPrice;

}