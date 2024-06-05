package com.ftn.sbnz.service.tests;

import com.ftn.sbnz.model.models.House;
import com.ftn.sbnz.service.SampleAppService;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
// import org.kie.api.KieServices;
// import org.kie.api.runtime.KieContainer;
// import org.kie.api.runtime.KieSession;



public class CEPConfigTest {


    @Test
    public void test() {
         KieServices ks = KieServices.Factory.get();
         KieContainer kContainer = ks.getKieClasspathContainer();
         KieSession ksession = kContainer.newKieSession("basicKsession");

        List<Object> recommendations = new ArrayList<>();
        ksession.setGlobal("recommendations", recommendations);
        House house = new House();
        house.setFloors(1); // Setting floors to 1 to match the rule condition

        ksession.insert(house);
        ksession.fireAllRules();
        System.out.println("Recommendations: " + recommendations);

        ksession.dispose();

      
    }
}
