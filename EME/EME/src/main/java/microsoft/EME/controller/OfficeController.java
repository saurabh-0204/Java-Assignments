package microsoft.EME.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import microsoft.EME.dao.OfficeDAO;
import microsoft.EME.service.OfficeService;

@RestController
public class OfficeController {
	@Autowired
	OfficeService oService;

	@GetMapping("/getByCountry")
    public List<OfficeDAO> getByCountry(@RequestParam String country) {
        return oService.getByCountry(country);
    }
	
	@GetMapping("/getAll")
	public List<OfficeDAO> getAll()
	{
		return oService.getAll();
	}

	
	
	@PutMapping("/updatePhone")
    public OfficeDAO updatePhone(@RequestParam String officecode, @RequestParam String phone) {
        return oService.updatePhone(officecode, phone);
    }
}
