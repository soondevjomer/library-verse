package com.soondevjomer.libraryverse.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Integer id;
    private String email;
    private String username;
    private String password;
}
