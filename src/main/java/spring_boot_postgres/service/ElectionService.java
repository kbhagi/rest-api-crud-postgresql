package spring_boot_postgres.service;

import spring_boot_postgres.model.Election;

import java.util.List;

public interface ElectionService {

    List<Election> findAll();
}
