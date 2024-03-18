package microsoft.EME.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import microsoft.EME.dao.OfficeDAO;
import microsoft.EME.repo.OfficeRepo;

@Service
public class OfficeService {
	@Autowired
  OfficeRepo oRepo;
	
	public List<OfficeDAO> getAll(){
		return oRepo.findAll();
	}

	public List<OfficeDAO> getByCountry(String country) {
        return oRepo.findByCountry(country);
    }
	
	
	@Transactional
    public OfficeDAO updatePhone(String officecode, String phone) {
        OfficeDAO office = oRepo.findById(officecode).orElse(null);

        if (office != null) {
            office.setPhone(phone);
            return oRepo.save(office);
        }

        return null; 
    }
}
