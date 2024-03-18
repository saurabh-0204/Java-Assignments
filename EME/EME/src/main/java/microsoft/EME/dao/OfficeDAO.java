package microsoft.EME.dao;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//offfice Dao class 
@Entity
@Table(name = "offices")
public class OfficeDAO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String officecode;
	@Column
	String city;
	@Column
	String phone;
	@Column
	String addressline1;
	@Column
	String addressline2;
	@Column
	String state;
	@Column
	String country;
	@Column
	String postalcode;
	@Column
	String territory;
	
	public OfficeDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public OfficeDAO(String city, String phone, String addressline1, String addressline2, String state, String country,
			String postalcode, String territory) {
		super();
		this.city = city;
		this.phone = phone;
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.state = state;
		this.country = country;
		this.postalcode = postalcode;
		this.territory = territory;
	}


	public OfficeDAO(String officecode, String city, String phone, String addressline1, String addressline2, String state,
			String country, String postalcode, String territory) {
		super();
		this.officecode = officecode;
		this.city = city;
		this.phone = phone;
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.state = state;
		this.country = country;
		this.postalcode = postalcode;
		this.territory = territory;
	}


	public String getOfficecode() {
		return officecode;
	}

	public void setOfficecode(String officecode) {
		this.officecode = officecode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	@Override
	public String toString() {
		return "OfficeDAO [officecode=" + officecode + ", city=" + city + ", phone=" + phone + ", addressline1="
				+ addressline1 + ", addressline2=" + addressline2 + ", state=" + state + ", country=" + country
				+ ", postalcode=" + postalcode + ", territory=" + territory + "]";
	}
	
}
