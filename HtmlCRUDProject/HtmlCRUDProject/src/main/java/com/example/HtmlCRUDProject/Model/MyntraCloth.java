package com.example.HtmlCRUDProject.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="mcloth")
@Data
public class MyntraCloth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String wear;
    private double cost;


}
