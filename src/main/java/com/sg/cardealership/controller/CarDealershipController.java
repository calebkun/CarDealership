/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.cardealership.controller;

import com.sg.cardealership.models.Contact;
import com.sg.cardealership.models.Make;
import com.sg.cardealership.models.Model;
import com.sg.cardealership.models.Sale;
import com.sg.cardealership.models.Special;
import com.sg.cardealership.models.User;
import com.sg.cardealership.models.Vehicle;
import com.sg.cardealership.service.CarDealershipServiceLayer;
import com.sg.cardealership.service.InventoryReport;
import com.sg.cardealership.service.PasswordChangeContext;
import com.sg.cardealership.service.ReportQueryContext;
import com.sg.cardealership.service.SaleRequestContext;
import com.sg.cardealership.service.SalesReport;
import com.sg.cardealership.service.UserRequestContext;
import com.sg.cardealership.service.VehicleQueryContext;
import com.sg.cardealership.service.VehicleRequestContext;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author calebdiaz
 */
@RestController
@RequestMapping("/api")
public class CarDealershipController {
    
    private final CarDealershipServiceLayer service;
    
    public CarDealershipController(CarDealershipServiceLayer service){
        this.service = service;
    }
    
    @GetMapping("/home/index")
    public List<Vehicle> home(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @GetMapping("/inventory/new")
    public ResponseEntity<List<Vehicle>> getNewVehicles(@RequestBody VehicleQueryContext query){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @GetMapping("/inventory/used")
    public ResponseEntity<List<Vehicle>> getUsedVehicles(@RequestBody VehicleQueryContext query){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @GetMapping("/inventory/details/{id}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable int id){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @GetMapping("home/special")
    public List<Special> getAllSpecials(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @PostMapping("home/contact")
    public ResponseEntity<Contact> contact(@RequestBody Contact contact){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @GetMapping("/sales/index")
    public ResponseEntity<List<Vehicle>> getSaleVehicles(@RequestBody VehicleQueryContext query){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @PostMapping("/sales/purchase/{id}")
    public ResponseEntity<Sale> logSale(@PathVariable int id, @RequestBody SaleRequestContext request){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @GetMapping("/admin/vehicles")
    public ResponseEntity<List<Vehicle>> getAdminVehicles(@RequestBody VehicleQueryContext query){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @PostMapping("/admin/addvehicle")
    public ResponseEntity addVehicle(@RequestBody VehicleRequestContext vehicleRequest){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @PutMapping("/admin/editvehicle/{id}")
    public ResponseEntity updateVehicle(@PathVariable int id, @RequestBody VehicleRequestContext vehicleRequest){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @GetMapping("/admin/users")
    public List<User> getAllUsers(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @PostMapping("/admin/adduser")
    public ResponseEntity<User> addUser(@RequestBody UserRequestContext userRequest){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @PutMapping("/admin/edituser/{id}")
    public ResponseEntity updateUser(@RequestBody UserRequestContext userRequest, @PathVariable int id){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @PutMapping("/account/changepassword/{id}")
    public ResponseEntity updatePassword(@RequestBody PasswordChangeContext pass, @PathVariable int Id){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @GetMapping("/admin/makes")
    public List<Make> getAllMakes(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @PostMapping("/admin/makes")
    public ResponseEntity<Make> addMake(@RequestBody Make make, @RequestParam int userId){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @GetMapping("/admin/models")
    public List<Model> getAllModels(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @PostMapping("/admin/models")
    public ResponseEntity<Model> addModel(@RequestBody Model model, @RequestParam int userId, @RequestParam int makeId){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @GetMapping("/admin/specials")
    public List<Special> getAdminAllSpecials(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @PostMapping("/admin/specials")
    public ResponseEntity<Special> addSpecial(@RequestBody Special special){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @DeleteMapping("/admin/specials/{id}")
    public ResponseEntity deleteSpecial(@PathVariable int id){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @GetMapping("/reports/sales")
    public ResponseEntity<List<SalesReport>> getSalesReport(@RequestBody ReportQueryContext query){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @GetMapping("/reports/inventory")
    public List<InventoryReport> getInventoryReport(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
