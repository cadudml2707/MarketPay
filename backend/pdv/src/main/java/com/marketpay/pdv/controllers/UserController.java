/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marketpay.pdv.controllers;

import com.marketpay.pdv.services.UserServices;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends UserServices {
    
    @GetMapping("/listar")
    public String listarUsers(){
        return "usuários";
    }
    
    @PostMapping("/cadastrar")
    public String cadastrarUsers(){
        return "cadastrado";
    }
    
    @PutMapping("/atualizado")
    public String atualizarUsers(){
        return "atualizado";
    }
    
    @DeleteMapping("/deletado")
    public String deletarUsers(){
        return "deletado";
    }
}
