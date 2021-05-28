package com.tts.WeatherApp.Model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class ZipCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String zipCode;

    @CreationTimestamp
    private Date createdAt;


    public ZipCode(){

    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

}
