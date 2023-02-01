package fr.momozer.m2i.ECF.ecfback.utils;
import lombok.Data;
import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;

@Data
public class Entity {

    @Id
    private String id;

    protected LocalDateTime dateCreation = LocalDateTime.now();
    protected LocalDateTime dateModification = LocalDateTime.now();
}
