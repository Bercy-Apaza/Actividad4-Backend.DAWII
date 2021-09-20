package com.medicamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicamento.entity.Medicamento;
import com.medicamento.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService{
	
	@Autowired
	private MedicamentoRepository repository;

	@Override
	public List<Medicamento> listaMedicamento() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Medicamento insertaActualizaMedicamento(Medicamento obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}
	
	
	

}
