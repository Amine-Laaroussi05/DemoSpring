package ib.demoSpring.config;

import ib.demoSpring.dao.GuitareDAO;
import ib.demoSpring.entity.Guitare;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);


    @Bean
    CommandLineRunner initDatabase(GuitareDAO guitareDAO){
        return args -> {
            log.info("loading data " + guitareDAO.save(new Guitare("Gibson")));
            log.info("loading data " + guitareDAO.save(new Guitare("Cuatro")));
            log.info("loading data " + guitareDAO.save(new Guitare("Tres")));
            log.info("loading data " + guitareDAO.save(new Guitare("Flamenco")));
            log.info("loading data " + guitareDAO.save(new Guitare("Electric")));
            log.info("loading data " + guitareDAO.save(new Guitare("Basse")));
            log.info("loading data " + guitareDAO.save(new Guitare("Hawaïenne")));
            log.info("loading data " + guitareDAO.save(new Guitare("Banjo")));
        };
    }
}
