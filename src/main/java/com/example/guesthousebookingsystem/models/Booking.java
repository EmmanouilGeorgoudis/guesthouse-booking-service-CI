package com.example.guesthousebookingsystem.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message="Checkin date required")
    private LocalDate checkIn;
    @NotNull(message="Checkout date required")
    private LocalDate checkOut;

    @NotNull
    private Long customerid;

    @NotNull
    private Long roomid;

}

//GitHub-accesstest