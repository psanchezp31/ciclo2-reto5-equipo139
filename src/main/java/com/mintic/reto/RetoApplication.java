package com.mintic.reto;

import com.mintic.reto.gui.PrincipalFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mintic.reto")
public class RetoApplication implements CommandLineRunner {

    @Autowired
    private PrincipalFrame principalFrame;

    public static void main(String[] args) {
        //SpringApplication.run(RetoApplication.class, args);
        new SpringApplicationBuilder(RetoApplication.class)
                .headless(false)
                .run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        principalFrame.setVisible(true);
    }

}
