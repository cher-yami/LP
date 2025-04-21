package com.example.msproducto.service;

import com.example.msproducto.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
public List<Producto> ListarProductos();
public Producto guardar(Producto producto);
public Producto actualizar(Producto producto);
public Optional<Producto> ListarPorId(Integer id);
public void eliminarPorId(Integer id);
}
