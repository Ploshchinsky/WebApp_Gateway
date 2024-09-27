package ploton.webapp_service_products.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ploton.webapp_service_products.entities.ProductEntity;
import ploton.webapp_service_products.services.ProductService;

import java.util.Map;

@RestController
@RequestMapping("products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello from ProductService";
    }

    @PostMapping("/new")
    public ResponseEntity<?> save(@RequestBody ProductEntity entity) {
        return new ResponseEntity<>(productService.save(entity), HttpStatus.ACCEPTED);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(productService.findById(id), HttpStatus.OK);
    }


    @GetMapping("/")
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<?> updateById(@PathVariable("id") Integer id,
                                        @RequestBody Map<String, Object> updates) {
        return new ResponseEntity<>(productService.updateById(id, updates), HttpStatus.OK);
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(productService.deleteById(id), HttpStatus.NO_CONTENT);
    }
}
