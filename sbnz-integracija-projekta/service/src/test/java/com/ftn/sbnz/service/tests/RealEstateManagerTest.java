package com.ftn.sbnz.service.tests;

import com.ftn.sbnz.model.models.RealEstate;
import com.ftn.sbnz.repository.RealEstateRepository;
import org.drools.core.impl.KieSessionsPoolImpl;
import org.junit.jupiter.api.Test;
import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RealEstateManagerTest {
    private final KieContainer kieContainer = kieContainer();
    @Test
    public void testReadRealEstateFromFile() throws IOException {
        RealEstateRepository repository = new RealEstateRepository();
        List<RealEstate> realEstates =repository.allRealEstates();
        for (RealEstate realEstate : realEstates) {
            System.out.println(realEstate);
        }


        List<RealEstate> recommendations = new ArrayList<>();


        KieSession kieSession = kieContainer.newKieSession("basicKsession");

        System.out.println(kieSession);
        kieSession.setGlobal("recommendations", recommendations);



        for(RealEstate realEstate: realEstates) {
            kieSession.insert(realEstate);
        }

        kieSession.fireAllRules();
        kieSession.dispose();
        for (RealEstate realEstate : recommendations) {
            System.out.println(realEstate);
        }
    }

    @Bean
    public KieContainer kieContainer() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks
                .newKieContainer(ks.newReleaseId("com.ftn.sbnz", "kjar", "0.0.1-SNAPSHOT"));
        KieScanner kScanner = ks.newKieScanner(kContainer);
        kScanner.start(1000);
        return kContainer;
    }






}
