package com.example.springjpa.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverrides({
        @AttributeOverride(name = "name",
                column =@Column(name = "guardian_name" )
        ),

        @AttributeOverride(name = "email",column =@Column(name = "guardain_email")
        )
})
public class Guardian {

    private String name;

    private  String email;



}
