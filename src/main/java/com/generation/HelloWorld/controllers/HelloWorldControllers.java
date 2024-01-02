package com.generation.HelloWorld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//EndPoint1
@RestController
@RequestMapping("/helloworld")
public class HelloWorldControllers {
    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
    //EndPoint2
    @RestController
    @RequestMapping("/bsm")
    public class BSMGen {

        @GetMapping
            public String bsm () {
                return "<strong>BSM's da Generation Brazil:</strong>"
                        + "<br/>Persistência;<br/>"
                        + "Mentalidade de Crescimento;<br/>"
                        + "Responsabilidade Pessoal;<br/>"
                        + "Orientação ao Futuro;<br/>"
                        + "Proatividade;<br/>"
                        + "Comunicação;<br/>"
                        + "Trabalho em Equipe;<br/>"
                        + "Orientação ao Detalhe.";
            }
        }
//EndPoint3
        @RestController
        @RequestMapping("/objetivos")
        public class Objetivos {

            @GetMapping
            public String objetivos () {
                return "<strong>Gostaria de aprender:</strong>"
                        + "<br>Muito+Sobre Spring e a forma de conectar  com as paginas web;<br/>"
                        + "<br>Alem de TDD;<br/>";
            }
        }
    }
