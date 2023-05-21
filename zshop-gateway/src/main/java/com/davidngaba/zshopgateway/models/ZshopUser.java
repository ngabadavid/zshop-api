package com.davidngaba.zshopgateway.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ZshopUser {
    private Long id;
    private String firstName;
    private String email;
}
