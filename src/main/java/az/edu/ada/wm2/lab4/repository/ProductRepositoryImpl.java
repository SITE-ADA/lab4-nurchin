package az.edu.ada.wm2.lab4.repository;

import az.edu.ada.wm2.lab4.model.Product;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    // HashMap
    private final Map<UUID, Product> storage = new HashMap<>();

    // methods


    //In save() method auto-generate UUID if null, then store in the map
    @Override
    public Product save(Product product) {
        if (product.getId() == null) {
            product.setId(UUID.randomUUID());
        }
        storage.put(product.getId(), product);

        return product;
    }


    //findById() must return Optional<Product>
    @Override
    public Optional<Product> findById(UUID id) {
        return Optional.ofNullable(storage.get(id));
    }


    //findAll() returns a new ArrayList of values
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(storage.values());
    }

    //deleteById() removes from the map
    @Override
    public void deleteById(UUID id) {
        storage.remove(id);
    }



    //existsById() checks if the map contains the key
    @Override
    public boolean existsById(UUID id) {
        return storage.containsKey(id);
    }
}