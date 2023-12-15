package org.example;

import org.springframework.stereotype.Component;

@Component
public class OperaticMusic implements Music {
    @Override
    public String getSong() {
        return "Some famous Operatic song";
    }
}
