
package com.wipro.greatlearning.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.greatlearning.dto.AdminDTO;
import com.wipro.greatlearning.entity.Admin;
import com.wipro.greatlearning.repository.AdminRepository;
import com.wipro.greatlearning.service.IAdminService;

/**
 * @author Soumyadeep
 * Modified Date: 24-08-2022
 * Description:Admin service class
 */
@Service
public class AdminServiceImp implements IAdminService {
	
	
	@Autowired
	private AdminRepository repo;

	/**
	 * @author Soumyadeep
	 * Modified Date: 24-08-2022
	 * Description: to add admin
	 * Return Type: String
	 * Params:AdminDTO object
	 */	

	@Override
	public String addAdmin(AdminDTO adminDto) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.setEmail(adminDto.getEmail());
		admin.setPassword(adminDto.getPassword());
			repo.save(admin);
			return "New Admin data saved";
		
	}
	
	/**
	 * @author Soumyadeep
	 * Modified Date: 24-08-2022
	 * Description: to add admin
	 * Return Type: List of Admin object
	 * Params: NA
	 */	

	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}

}
