package com.metropolitan.pz.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.io.Serializable;
@AllArgsConstructor
@Getter
public class JwtToken implements Serializable {
    private String token;
}

