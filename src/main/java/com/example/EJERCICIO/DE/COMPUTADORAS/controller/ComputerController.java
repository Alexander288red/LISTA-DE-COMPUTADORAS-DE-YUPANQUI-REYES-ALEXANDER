/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EJERCICIO.DE.COMPUTADORAS.controller;

import com.example.EJERCICIO.DE.COMPUTADORAS.model.Computer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Corregido: importar org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/computers")
public class ComputerController {

    // Lista en memoria para almacenar las computadoras
    private List<Computer> computers = new ArrayList<>();
    private Long currentId = 1L;

    // Obtener todos los productos
    @GetMapping
    public String listComputers(Model model) {
        model.addAttribute("computers", computers);
        return "computer-list"; // Vista que muestra la lista de computadoras
    }

    // Mostrar el formulario para agregar una nueva computadora
    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("computer", new Computer(null, "", "", "", 0, 0));
        return "computer-form"; // Vista del formulario de agregar computadora
    }

    // Agregar una nueva computadora
    @PostMapping("/add")
    public String addComputer(@ModelAttribute Computer computer) {
        computer.setId(currentId++); // Asignamos un ID único a cada computadora
        computers.add(computer); // Añadimos la computadora a la lista
        return "redirect:/computers"; // Redirigimos a la lista de computadoras
    }
}