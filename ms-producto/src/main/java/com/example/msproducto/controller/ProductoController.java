package com.example.msproducto.controller;

import com.example.msproducto.entity.Producto;
import com.example.msproducto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoController productoController;
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> list() {
        return ResponseEntity.ok().body(productoService.ListarProductos());
    }
    @PostMapping()
    public ResponseEntity<Producto> save(@RequestBody Producto producto) {
        return ResponseEntity.ok().body(productoService.guardar(producto));
    }
    @PutMapping()
    public ResponseEntity<Producto> update(@RequestBody Producto producto) {
        return ResponseEntity.ok().body(productoService.actualizar(producto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Producto> ListById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(productoService.ListarPorId(id).get());
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable(required = true) Integer id) {
        productoService.eliminarPorId(id);
        return "Se elimino con exito";
    }
}
