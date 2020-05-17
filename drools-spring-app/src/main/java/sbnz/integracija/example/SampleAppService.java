package sbnz.integracija.example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbnz.integracija.example.facts.Item;
import sbnz.integracija.example.facts.Vehicle;
import sbnz.integracija.example.facts.VehicleCategory;

@Service
public class SampleAppService {

	private static Logger log = LoggerFactory.getLogger(SampleAppService.class);

	private final KieContainer kieContainer;

	@Autowired
	public SampleAppService(KieContainer kieContainer) {
		log.info("Initialising a new example session.");
		this.kieContainer = kieContainer;
	}

	public Item getClassifiedItem(Item i) {
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(i);
		kieSession.fireAllRules();
		kieSession.dispose();
		return i;
	}
	
	public Vehicle getClassifiedVehicle(Vehicle v) {
		KieSession kieSession = kieContainer.newKieSession();
		
		//Kreiranje cinjenica
        Vehicle v1 = new Vehicle();
        
        v1.setName("JGSP vozilo");
        v1.setCategory(VehicleCategory.STATEOWNED);
        v1.setPrice(250.0);
        
		kieSession.insert(v1);
		kieSession.fireAllRules();
		kieSession.dispose();
		return v1;
	}
}
