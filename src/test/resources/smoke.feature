Feature:
  Como feligres
  quiero buscar el listado de iglesias 
  para encontrar información de la iglesia

  Scenario: ingresar al portal de iglesias
    Given que ingreso a la pagina web de las iglesias 
    When doy clic en el boton de "Ingresar al Portal"
    Then ingresa al portal
    And  se lista la información de la iglesia