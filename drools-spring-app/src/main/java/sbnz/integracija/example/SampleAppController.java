package sbnz.integracija.example;

import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sbnz.integracija.example.facts.Item;
import sbnz.integracija.example.facts.Item.Category;
import sbnz.integracija.example.facts.TiresSymptoms;
import sbnz.integracija.example.facts.Vehicle;
import sbnz.integracija.example.facts.VehicleCategory;

@RestController
public class SampleAppController {
	private static Logger log = LoggerFactory.getLogger(SampleAppController.class);

	private final SampleAppService sampleService;

	@Autowired
	public SampleAppController(SampleAppService sampleService) {
		this.sampleService = sampleService;
	}

	@RequestMapping(value = "/item", method = RequestMethod.GET, produces = "application/json")
	public Item getQuestions(@RequestParam(required = true) String id, @RequestParam(required = true) String name,
			@RequestParam(required = true) double cost, @RequestParam(required = true) double salePrice) {

		Item newItem = new Item(Long.parseLong(id), name, cost, salePrice);

		log.debug("Item request received for: " + newItem);

		Item i2 = sampleService.getClassifiedItem(newItem);

		return i2;
	}
	
	@RequestMapping(value = "/vehicle", method = RequestMethod.GET, produces = "application/json")
	public Vehicle getVehicle(@RequestParam(required = true) String id) {
		
		ArrayList<String> s;

		if(Long.parseLong(id) == 1) { 
			Vehicle newVehicle = new Vehicle(Long.parseLong(id), "Bus", VehicleCategory.STATEOWNED, "Gume", Arrays.asList("ABS warning light may come on", "Check Engine Light comes on"), 0.0, 34.0);
			log.debug("----------- Vehicle request received for: " + newVehicle);
			Vehicle v2 = sampleService.getClassifiedVehicle(newVehicle);
			return v2;
		} else if(Long.parseLong(id) == 2) {
			Vehicle newVehicle = new Vehicle(Long.parseLong(id), "Kombi", VehicleCategory.PRIVATEOWNED, "Gume", Arrays.asList("Check Engine Light comes on", "All indicator lights in instrument panel/cluster come on"), 0.0, 4.0);
			log.debug("----------- Vehicle request received for: " + newVehicle);
			Vehicle v2 = sampleService.getClassifiedVehicle(newVehicle);
			return v2;
		} else if(Long.parseLong(id) == 3) {
			Vehicle newVehicle = new Vehicle(Long.parseLong(id), "Motor", VehicleCategory.REGULAR, "Gume", Arrays.asList("Check Engine Light comes on", "ABS warning light comes on", "TRAC or ESP/ESC (or both) warning light comes on"), 0.0, 1.0);
			log.debug("----------- Vehicle request received for: " + newVehicle);
			Vehicle v2 = sampleService.getClassifiedVehicle(newVehicle);
			return v2;
		} else {
			Vehicle newVehicle = new Vehicle(Long.parseLong(id), "Automobil", VehicleCategory.REGULAR, "Gume", Arrays.asList("Red battery light on", "Reduced fuel economy", "Transmission may fail"), 0.0, 7.0);
			log.debug("----------- Vehicle request received for: " + newVehicle);
			Vehicle v2 = sampleService.getClassifiedVehicle(newVehicle);
			return v2;
		}

	}
	
	
	
}
