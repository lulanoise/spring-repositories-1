package co.develhope.springrepositories1.entities;
import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

@Entity
@Table
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

    public Car(int id, @NotNull String modelName, @NotNull String serialNumber, @NotNull String currentPrice) {
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }
}