package com.santos.disciplina.disciplina.controlador;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.santos.disciplina.disciplina.dao.DisciplinaDAO;
import com.santos.disciplina.disciplina.dominio.Disciplina;

@Controller
public class Controlador {
@GetMapping("/disciplinas")

public String tabelaDisciplina(Model modelo) {
	DisciplinaDAO dao = new DisciplinaDAO();
	List<Disciplina> lista = dao.todos();
	modelo.addAttribute("lista", lista);
	return "Disciplinas";

}
}
