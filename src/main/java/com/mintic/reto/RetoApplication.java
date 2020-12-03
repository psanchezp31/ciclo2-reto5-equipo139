package com.mintic.reto;

import com.mintic.reto.gui.PrincipalFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class RetoApplication implements CommandLineRunner {

    @Autowired
    private PrincipalFrame principalFrame;

    public static void main(String[] args) {
        new SpringApplicationBuilder(RetoApplication.class)
                .headless(false)
                .run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        principalFrame.setVisible(true);
    }

}
