package com.recupera.project.danielly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.recupera.project.danielly.domain.User;
import com.recupera.project.danielly.service.ProjectService;
/**
 * Controlador REST responsável por gerenciar as requisições relacionadas ao projeto.
 * Utiliza as anotações do Spring para mapear os endpoints da API.
 */
@RestController
@RequestMapping("/entrar") // Mapeia a URL base para este controlador
public class ProjectController {

    // Injeção de dependência do serviço que contém a lógica de negócios
    @Autowired
    private ProjectService projectService;

    /**
     * Endpoint GET para retornar uma mensagem personalizada.
     * 
     * @return String com a mensagem personalizada
     */
    @GetMapping
    public String project() {
        // Chama o serviço para obter a mensagem personalizada
        return projectService.project(" Pessoa");
    }

    /**
     * Endpoint POST para processar dados enviados pelo cliente.
     * 
     * @param id     Identificador passado na URL
     * @param filter Parâmetro opcional passado na URL
     * @param body   Corpo da requisição contendo os dados do usuário
     * @return String com a mensagem personalizada
     */
    @PostMapping("/{id}")
    public String projectPost(
            @PathVariable("id") String id, // Captura o valor do ID na URL
            @RequestParam(value = "filter", defaultValue = "nenhuma") String filter, // Captura o parâmetro 'filter' na URL, com valor padrão 'nenhuma'
            @RequestBody User body // Captura o corpo da requisição e mapeia para o objeto User
    ) {
        // Retorna uma mensagem personalizada com os dados recebidos
        return "Bem Vindo(o) " + body.getName() + " " + body.getEmail() + id + filter;
    }
}

