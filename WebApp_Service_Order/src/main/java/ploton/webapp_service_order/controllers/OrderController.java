package ploton.webapp_service_order.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ploton.webapp_service_order.entities.OrderEntity;
import ploton.webapp_service_order.services.OrderService;

import java.util.Map;

@RestController
@RequestMapping("orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @GetMapping("/hello")
    public String hello() {
        return "Hello from OrderService";
    }

    @PostMapping("/new")
    public ResponseEntity<?> save(@RequestBody OrderEntity entity) {
        return new ResponseEntity<>(orderService.save(entity), HttpStatus.ACCEPTED);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(orderService.findById(id), HttpStatus.OK);
    }


    @GetMapping("/")
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<>(orderService.findAll(), HttpStatus.OK);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<?> updateById(@PathVariable("id") Integer id,
                                        @RequestBody Map<String, Object> updates) {
        return new ResponseEntity<>(orderService.updateById(id, updates), HttpStatus.OK);
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(orderService.deleteById(id), HttpStatus.NO_CONTENT);
    }
}
