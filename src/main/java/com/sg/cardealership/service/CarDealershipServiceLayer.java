/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.cardealership.service;

import com.sg.cardealership.models.Contact;
import com.sg.cardealership.models.Make;
import com.sg.cardealership.models.Model;
import com.sg.cardealership.models.Sale;
import com.sg.cardealership.models.Special;
import com.sg.cardealership.models.User;
import com.sg.cardealership.models.Vehicle;
import java.util.List;

/**
 *
 * @author calebdiaz
 */
public interface CarDealershipServiceLayer {
    
    List<Vehicle> home();
    List<Vehicle> getVehicles(VehicleQueryContext query);
    Vehicle getVehicleById(int id);
    List<Special> getSpecials();
    Contact addContact(Contact contact);
    Sale addSale(Sale sale, int vehicleId, int userId);
    Vehicle addVehicle(VehicleRequestContext vehicleContext);
    boolean editVehicle(VehicleRequestContext vehicleContext);
    List<User> getUsers();
    User addUser(UserRequestContext userContext);
    boolean updateUser(UserRequestContext userContext);
    boolean updatePassword(PasswordChangeContext pass);
    List<Make> getMakes();
    List<Model> getModels();
    Make addMake(Make make);
    Model addModel(Model model);
    Special addSpecial(Special special);
    boolean deleteSpecialById(int id);
    List<SalesReport> getSalesReport(ReportQueryContext query);
    List<InventoryReport> getInventoryReport();

}
