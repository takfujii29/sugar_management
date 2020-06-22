package jp.co.aivick.sugar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.aivick.sugar.dao.ProductDao;
import jp.co.aivick.sugar.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public List<Product> findAll() {
		return this.productDao.findAll();
	}
}
