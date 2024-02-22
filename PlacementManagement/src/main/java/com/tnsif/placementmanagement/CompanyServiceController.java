package com.tnsif.placementmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyServiceController 
{
	@Autowired
	CompanyServiceRepository repo;
	
	@PostMapping("/add")
	public Company addCompanyDeteails(@RequestBody Company company)
	{
		return repo.save(company);
	}
	
	@GetMapping("/fetch")
	public List<Company> fetchCompanyDeteails()
	{
		return repo.findAll();
	}
	
	@PutMapping("/update/{id}")
	public Company updateCompanyDeteails(@PathVariable Integer id,@RequestBody Company company)
	{
		company.setCompanyId(id);
		return repo.save(company);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCompanyDeteails(@PathVariable Integer id)
	{
		repo.deleteById(id);
	}
}
