package com.ecommerce.sportscenter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.sportscenter.entity.Product;
import com.ecommerce.sportscenter.service.AdminService;

@RestController
@RequestMapping(value = "/api/admin")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/create")
    public Product createAdmin(@RequestBody Product product) {
        return adminService.createProduct(product);
    }
    @PutMapping("/update/{id}")
    public Product updateAdmin(@PathVariable Integer id, @RequestBody Product product) {
        return adminService.createProduct(product);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteAdmin(@RequestParam Integer id) {
        adminService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}