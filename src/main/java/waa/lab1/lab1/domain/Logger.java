package waa.lab1.lab1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Logger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long transactionId;
    LocalDate date;
    LocalTime time;
    long principle;
    String operation;
}
