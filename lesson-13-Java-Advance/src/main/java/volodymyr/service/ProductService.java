package volodymyr.service;

import java.util.Map;

import volodymyr.domain.Product;
import volodymyr.shared.AbstractCRUD;

public interface ProductService extends AbstractCRUD<Product>{
	public Map<Integer, Product> readAllMap();
}