package com.wipro.greatlearning.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.wipro.greatlearning.dto.ProductsDTO;
import com.wipro.greatlearning.entity.Products;

/**
 * @author Soumyadeep
 * Modified Date: 27/08/2022
 * Description: Product service interface
 *
 */

public interface IProductsService {
	
	public String addProducts(ProductsDTO productDto);
	
	public List<Products> getAllProducts();
	
	public String updateProducts(ProductsDTO productDto);
	
	public String deleteProducts(long id);
	
	public Products getProductById(long id);
	
	public void saveMultiple(MultipartFile file);
	
	public List<Products> getSortedProduct();

}
