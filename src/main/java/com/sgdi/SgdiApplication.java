package com.sgdi;




import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sgdi.domin.Equipamento;
import com.sgdi.domin.Marca;
import com.sgdi.domin.Setor;
import com.sgdi.domin.TipoEquipamento;
import com.sgdi.domin.Unidade;
import com.sgdi.enums.Entidade;
import com.sgdi.repositorio.EquipamentoRepository;
import com.sgdi.repositorio.MarcaRepository;
import com.sgdi.repositorio.SetorRepository;
import com.sgdi.repositorio.TipoEquipamentoRepository;
import com.sgdi.repositorio.UnidadeRepository;

@SpringBootApplication
public class SgdiApplication implements CommandLineRunner{

	@Autowired
	private MarcaRepository marcaRepository;
	
	@Autowired
	private TipoEquipamentoRepository tipoEquipamentoRepository;
	
	@Autowired
	private UnidadeRepository unidadeRepository;
	
	@Autowired
	private SetorRepository setorRepository;
	
	@Autowired
	private EquipamentoRepository equipamentoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SgdiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Marca m1 = new Marca(null, "HP");
		Marca m2 = new Marca(null, "SAMSUNG");
		Marca m3 = new Marca(null, "DELL");		
		marcaRepository.saveAll(Arrays.asList(m1, m2, m3));
		
		TipoEquipamento t1 = new TipoEquipamento(null, "Notebook");
		TipoEquipamento t2 = new TipoEquipamento(null, "Microcomputador");
		TipoEquipamento t3 = new TipoEquipamento(null, "Nobreak");
		tipoEquipamentoRepository.saveAll(Arrays.asList(t1, t2, t3));
		
		Unidade u1 = new Unidade(null, "Cuiaba", Entidade.SENAI);
		Unidade u2 = new Unidade(null, "Distrito", Entidade.SENAI);
		Unidade u3 = new Unidade(null, "Cuiaba", Entidade.SESI);
		Unidade u4 = new Unidade(null, "Sinop", Entidade.SESI);
		
		Setor s1 = new Setor(null, "Infomatica",u3);
		Setor s2 = new Setor(null, "Administrativo",u2);
		Setor s3 = new Setor(null, "Servidor",u4);
		Setor s4 = new Setor(null, "Educação",u1);
		
		
		
		unidadeRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
		setorRepository.saveAll(Arrays.asList(s1,s2,s3,s4));
		
		Equipamento e1 = new Equipamento(null, "3130089890", "32or0", "Microcomputador", m1, t1, Entidade.SENAI, u1);
		equipamentoRepository.saveAll(Arrays.asList(e1));
		
		
		
		
	}
	
}	