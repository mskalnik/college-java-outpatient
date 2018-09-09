/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.dal.repo;

/**
 *
 * @author mskalnik
 */
public final class RepositoryFactory {
    public static Repository getRepository() {
        return new SqlRepository();
    }
}
