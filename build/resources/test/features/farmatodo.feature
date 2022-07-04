#language: en
Feature: Busqueda de contenido en la app de farmatodo

  Scenario: Busqueda exitosa
    Given que el usuario se encuentra en la app farmatodo
    When desee agregar elementos al carrito
    Then usara la barra de busqueda para encontrar el contenido deseado