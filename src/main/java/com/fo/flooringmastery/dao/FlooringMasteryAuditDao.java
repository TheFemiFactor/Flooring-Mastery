/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fo.flooringmastery.dao;

/**
 *
 * @author TheFemiFactor
 */
public interface FlooringMasteryAuditDao {
    
    public void writeAuditEntry(String entry) 
            throws FlooringMasteryPersistenceException;
    
}
