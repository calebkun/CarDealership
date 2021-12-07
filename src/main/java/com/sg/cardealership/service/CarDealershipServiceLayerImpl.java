/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.cardealership.service;

import com.sg.cardealership.data.CarDealershipBodyStyleDao;
import com.sg.cardealership.data.CarDealershipColorDao;
import com.sg.cardealership.data.CarDealershipConditionDao;
import com.sg.cardealership.data.CarDealershipContactDao;
import com.sg.cardealership.data.CarDealershipInteriorDao;
import com.sg.cardealership.data.CarDealershipMakeDao;
import com.sg.cardealership.data.CarDealershipModelDao;
import com.sg.cardealership.data.CarDealershipPurchaseTypeDao;
import com.sg.cardealership.data.CarDealershipRoleDao;
import com.sg.cardealership.data.CarDealershipSaleDao;
import com.sg.cardealership.data.CarDealershipSpecialDao;
import com.sg.cardealership.data.CarDealershipStateDao;
import com.sg.cardealership.data.CarDealershipTransDao;
import com.sg.cardealership.data.CarDealershipUserDao;
import com.sg.cardealership.data.CarDealershipVehicleDao;
import com.sg.cardealership.models.BodyStyle;
import com.sg.cardealership.models.Color;
import com.sg.cardealership.models.Condition;
import com.sg.cardealership.models.Contact;
import com.sg.cardealership.models.Interior;
import com.sg.cardealership.models.Make;
import com.sg.cardealership.models.Model;
import com.sg.cardealership.models.PurchaseType;
import com.sg.cardealership.models.Role;
import com.sg.cardealership.models.Sale;
import com.sg.cardealership.models.Special;
import com.sg.cardealership.models.State;
import com.sg.cardealership.models.Trans;
import com.sg.cardealership.models.User;
import com.sg.cardealership.models.Vehicle;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author calebdiaz
 */
@Repository
public class CarDealershipServiceLayerImpl implements CarDealershipServiceLayer {
    
    private CarDealershipVehicleDao vehicleDao;
    private CarDealershipMakeDao makeDao;
    private CarDealershipModelDao modelDao;
    private CarDealershipConditionDao conditionDao;
    private CarDealershipBodyStyleDao bodyStyledao;
    private CarDealershipInteriorDao interiorDao;
    private CarDealershipColorDao colorDao;
    private CarDealershipTransDao transDao;
    private CarDealershipContactDao contactDao;
    private CarDealershipUserDao userDao;
    private CarDealershipRoleDao roleDao;
    private CarDealershipPurchaseTypeDao purchaseDao;
    private CarDealershipStateDao stateDao;
    private CarDealershipSpecialDao specialDao;
    private CarDealershipSaleDao saleDao;

    public CarDealershipServiceLayerImpl(CarDealershipVehicleDao vehicleDao, CarDealershipMakeDao makeDao, 
            CarDealershipModelDao modelDao, CarDealershipConditionDao conditionDao, CarDealershipBodyStyleDao bodyStyledao, 
            CarDealershipInteriorDao interiorDao, CarDealershipColorDao colorDao, CarDealershipTransDao transDao, 
            CarDealershipContactDao contactDao, CarDealershipUserDao userDao, CarDealershipRoleDao roleDao, 
            CarDealershipPurchaseTypeDao purchaseDao, CarDealershipStateDao stateDao, CarDealershipSpecialDao specialDao, 
            CarDealershipSaleDao saleDao) {
        this.vehicleDao = vehicleDao;
        this.makeDao = makeDao;
        this.modelDao = modelDao;
        this.conditionDao = conditionDao;
        this.bodyStyledao = bodyStyledao;
        this.interiorDao = interiorDao;
        this.colorDao = colorDao;
        this.transDao = transDao;
        this.contactDao = contactDao;
        this.userDao = userDao;
        this.roleDao = roleDao;
        this.purchaseDao = purchaseDao;
        this.stateDao = stateDao;
        this.specialDao = specialDao;
        this.saleDao = saleDao;
    }

    @Override
    public List<Vehicle> home() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehicle> getVehicles(VehicleQueryContext query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehicle getVehicleById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Special> getSpecials() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contact addContact(Contact contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sale addSale(Sale sale, int vehicleId, int userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehicle addVehicle(VehicleRequestContext vehicleContext) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editVehicle(VehicleRequestContext vehicleContext) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User addUser(UserRequestContext userContext) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateUser(UserRequestContext userContext) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updatePassword(PasswordChangeContext pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Make> getMakes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Model> getModels() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Make addMake(Make make) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Model addModel(Model model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Special addSpecial(Special special) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteSpecialById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SalesReport> getSalesReport(ReportQueryContext query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<InventoryReport> getInventoryReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Business logic and helper methods
    private VehicleRequestContext validateVehicleRequest(VehicleRequestContext request){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    
    private Make getMakeFromRequest(VehicleRequestContext request){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Model getModelFromRequest(VehicleRequestContext request){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Condition getConditionFromRequest(VehicleRequestContext request){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private BodyStyle getBodyStyleFromRequest(VehicleRequestContext request){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Interior getInteriorFromRequest(VehicleRequestContext request){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Trans getTransFromRequest(VehicleRequestContext request){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Color getColorFromRequest(VehicleRequestContext request){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Role getRoleFromRequest(UserRequestContext request){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private State getStateFromRequest(SaleRequestContext request){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private PurchaseType getPurchaseTypeFromRequest(SaleRequestContext request){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Vehicle getVehicleFromRequest(SaleRequestContext request){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private User getUsersfeFromRequest(SaleRequestContext request){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private VehicleQueryContext validateQuery(VehicleQueryContext query){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private VehicleQueryContext validateQueryForSalesAdmin(VehicleQueryContext query){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
