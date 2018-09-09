/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.bl;

import com.mskalnik.dal.repo.Repository;
import com.mskalnik.dal.repo.RepositoryFactory;

/**
 *
 * @author mskalnik
 */
public class HandlerBase {
    final Repository repository;
    
    public HandlerBase() {
        repository = RepositoryFactory.getRepository();
    }
}
