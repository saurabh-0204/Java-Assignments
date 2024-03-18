package microsoft.EME.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import microsoft.EME.dao.OfficeDAO;

@Repository
@Transactional
public interface OfficeRepo extends JpaRepository<OfficeDAO, String> {
	@Query("select o from OfficeDAO o where country like : country ")

	List<OfficeDAO> findByCountry(String country);

	@Modifying
	@Query("update OfficeDAO set phone= ?2 where officecode=?1")
	public int updatePhone(String code, String phone);

}
