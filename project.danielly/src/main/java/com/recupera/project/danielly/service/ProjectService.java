package com.recupera.project.danielly.service;

import org.springframework.stereotype.Service;

/**
 * Classe responsável pela lógica de negócios do projeto.
 * Anotada com @Service para que o Spring a reconheça como um componente de serviço.
 */
@Service
public class ProjectService {

    /**
     * Método que retorna uma mensagem personalizada de boas-vindas.
     * 
     * @param name Nome a ser incluído na mensagem.
     * @return String com a mensagem personalizada.
     */
    public String project(String name) {
        // Retorna a mensagem concatenando "Bem Vinda" com o nome fornecido
        return "Bem Vindo(a)" + name;
    }

}
