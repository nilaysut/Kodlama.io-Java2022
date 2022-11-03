package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;


import kodlama.io.rentACar.entities.concretes.Brand;


public interface BrandRepository { //Repository=Dao
	List<Brand> getAll();
}
